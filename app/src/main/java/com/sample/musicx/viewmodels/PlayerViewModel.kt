package com.sample.musicx.viewmodels

import android.os.SystemClock
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.PlaybackStateCompat
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sample.musicx.fragments.PlaylistPickerDialogFragment
import com.sample.musicx.utilities.*
import java.util.*
import kotlin.concurrent.fixedRateTimer

class PlayerViewModel : ViewModel() {

    val mediaMetadata = MutableLiveData<NowPlayingMetadata>()

    var playbackState = MutableLiveData<PlaybackStateCompat>()

    val isPlaying = MutableLiveData<Boolean>(false)

    val isLooping = MutableLiveData<Boolean>(false)

    val elapsedTime = MutableLiveData(0L)

    private var timer: Timer? = null

    init {
        playbackState.observeForever {
            when (it.state) {
                PlaybackStateCompat.STATE_PAUSED -> {
                    if (isPlaying.value != false) {
                        isPlaying.value = false

                        timer?.cancel()
                        timer?.purge()
                        timer = null
                    }
                }
                PlaybackStateCompat.STATE_PLAYING -> {
                    if (isPlaying.value == false) {
                        isPlaying.value = true

                        timer = fixedRateTimer("timer", initialDelay = 0, period = 1000) {
                            updateElapsedTime()
                        }
                    }
                }
                PlaybackStateCompat.STATE_SKIPPING_TO_NEXT,
                PlaybackStateCompat.STATE_SKIPPING_TO_PREVIOUS -> {
                    elapsedTime.value = 0
                    timer?.cancel()
                    timer?.purge()
                    isPlaying.value = false
                    timer = null
                }
            }
        }
    }

    fun showPlaylistPicker(fm: FragmentManager) {
        val trackId =
            mediaMetadata.value?.id ?: throw IllegalArgumentException("Track id's cannot be null")
        val dialog = PlaylistPickerDialogFragment.newInstance(trackId)
        dialog.show(fm, "NoticeDialogFragment")
    }

    fun updatePlaybackState(playbackState: PlaybackStateCompat) {
        this.playbackState.value = playbackState
    }

    fun updateLooping(repeatMode: Int) {
        when (repeatMode) {
            PlaybackStateCompat.REPEAT_MODE_ONE -> isLooping.value = true
            PlaybackStateCompat.REPEAT_MODE_ALL -> isLooping.value = false
        }
    }

    fun updateMediaMetadata(mediaMetadata: MediaMetadataCompat) {

        val nowPlayingMetadata = NowPlayingMetadata(
            mediaMetadata.id,
            mediaMetadata.albumArtUri.toString(),
            mediaMetadata.title ?: "",
            mediaMetadata.displaySubtitle ?: "",
            mediaMetadata.duration / 1000

        )

        this.mediaMetadata.postValue(nowPlayingMetadata)
    }

    private fun updateElapsedTime() {
        playbackState.value?.let {
            if (it.state == PlaybackStateCompat.STATE_PLAYING) {
                val timeDelta = SystemClock.elapsedRealtime() - it.lastPositionUpdateTime
                val currentTime = (it.position + timeDelta.toInt()) / 1000
                elapsedTime.postValue(currentTime)
            }
        }
    }
}

data class NowPlayingMetadata(
    val id: String,
    val albumArtUri: String,
    val title: String,
    val subtitle: String,
    val duration: Long
)