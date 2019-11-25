package com.sample.musicx.service

import android.annotation.SuppressLint
import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.Binder
import android.os.IBinder
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.MediaSessionCompat
import android.support.v4.media.session.PlaybackStateCompat
import android.support.v4.media.session.PlaybackStateCompat.REPEAT_MODE_ALL
import android.support.v4.media.session.PlaybackStateCompat.REPEAT_MODE_ONE
import com.sample.musicx.model.TrackCatalog
import com.sample.musicx.model.TrackEmbedded
import com.sample.musicx.utilities.*
import java.util.concurrent.TimeUnit

class MusicService : Service(), MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener {

    private lateinit var player: MediaPlayer

    var mediaSession: MediaSessionCompat? = null

    private lateinit var stateBuilder: PlaybackStateCompat.Builder
    private lateinit var metadataBuilder: MediaMetadataCompat.Builder

    private var currTrackIndex: Int = 0
    private lateinit var catalog: TrackCatalog

    private val currTrack
        get() = catalog.tracks[currTrackIndex]

    private val binder = MediaPlayerBinder()

    override fun onCreate() {
        mediaSession = MediaSessionCompat(this, MEDIA_SESSION_TAG).apply {

            // Enable callbacks from TransportControls
            setFlags(MediaSessionCompat.FLAG_HANDLES_TRANSPORT_CONTROLS)

            // Set an initial PlaybackState with ACTION_PLAY, so media buttons can start the player
            stateBuilder = PlaybackStateCompat.Builder()
                .setActions(
                    PlaybackStateCompat.ACTION_PLAY
                            or PlaybackStateCompat.ACTION_PLAY_PAUSE
                )

            setPlaybackState(stateBuilder.build())

            metadataBuilder = MediaMetadataCompat.Builder()

            // MediaSessionCallback() has methods that handle callbacks from a media controller
            setCallback(MediaSessionCallback())
        }

        player = MediaPlayer().apply {
            setOnPreparedListener(this@MusicService)
            setOnErrorListener(this@MusicService)
        }
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {

        currTrackIndex = intent?.getIntExtra(EXTRA_TRACK_INDEX, 0) ?: 0
        catalog = intent?.getParcelableExtra(EXTRA_TRACK_CATALOG) ?: TrackCatalog()

        player.setDataSource(currTrack.source)
        player.prepareAsync()

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder {
        return binder
    }

    override fun onUnbind(intent: Intent?): Boolean {
        return super.onUnbind(intent)
    }

    override fun onPrepared(mp: MediaPlayer?) {

        mediaSession?.setMetadata(metadataBuilder.from(currTrack).build())

        player.start()

        stateBuilder.setState(PlaybackStateCompat.STATE_PLAYING, 0, 1f)
        mediaSession?.setPlaybackState(stateBuilder.build())
    }

    override fun onError(mp: MediaPlayer?, what: Int, extra: Int): Boolean {
        return false
    }

    override fun onDestroy() {
        player.release()
    }

    inner class MediaPlayerBinder : Binder() {
        fun getService() = this@MusicService
    }

    inner class MediaSessionCallback : MediaSessionCompat.Callback() {

        override fun onPause() {
            if (player.isPlaying) {
                player.pause()

                stateBuilder.setState(
                    PlaybackStateCompat.STATE_PAUSED,
                    player.currentPosition.toLong(), 1f
                )

                mediaSession?.setPlaybackState(stateBuilder.build())
            }
        }

        override fun onPlay() {
            if (!player.isPlaying) {
                player.start()

                stateBuilder.setState(
                    PlaybackStateCompat.STATE_PLAYING,
                    player.currentPosition.toLong(), 1f
                )

                mediaSession?.setPlaybackState(stateBuilder.build())
            }
        }

        @SuppressLint("SwitchIntDef")
        override fun onSetRepeatMode(repeatMode: Int) {
            when (repeatMode) {
                REPEAT_MODE_ONE -> player.isLooping = true
                REPEAT_MODE_ALL -> player.isLooping = false
            }

            mediaSession?.setRepeatMode(repeatMode)
        }

        override fun onSkipToPrevious() {

            stateBuilder.setState(
                PlaybackStateCompat.STATE_SKIPPING_TO_PREVIOUS, 0, 1f
            )

            mediaSession?.setPlaybackState(stateBuilder.build())

            currTrackIndex--
            if (currTrackIndex == 0) currTrackIndex = catalog.tracks.size - 1

            player.reset()
            player.setDataSource(currTrack.source)
            player.prepareAsync()
        }


        override fun onSkipToNext() {

            stateBuilder.setState(
                PlaybackStateCompat.STATE_SKIPPING_TO_NEXT, 0, 1f
            )

            currTrackIndex++
            currTrackIndex %= catalog.tracks.size

            player.reset()
            player.setDataSource(currTrack.source)
            player.prepareAsync()
        }
    }

    companion object {
        const val EXTRA_TRACK_CATALOG = "track_catalog"
        const val EXTRA_TRACK_INDEX = "track_index"

        const val MEDIA_SESSION_TAG = "media_session"
    }
}

fun MediaMetadataCompat.Builder.from(track: TrackEmbedded): MediaMetadataCompat.Builder {
    id = track.id
    title = track.title
    artist = track.artist.name
    album = track.album.title
    duration = TimeUnit.SECONDS.toMillis(track.duration)
    mediaUri = track.source
    albumArtUri = track.album.image

    displayTitle = track.title
    displaySubtitle = track.album.title

    return this
}