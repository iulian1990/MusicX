package com.sample.musicx.fragments

import android.annotation.SuppressLint
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.graphics.Color
import android.os.Bundle
import android.os.IBinder
import android.support.v4.media.MediaMetadataCompat
import android.support.v4.media.session.MediaControllerCompat
import android.support.v4.media.session.PlaybackStateCompat
import android.support.v4.media.session.PlaybackStateCompat.REPEAT_MODE_ALL
import android.support.v4.media.session.PlaybackStateCompat.REPEAT_MODE_ONE
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.sample.musicx.databinding.FragmentPlayerBinding
import com.sample.musicx.service.MusicService
import com.sample.musicx.service.MusicService.Companion.EXTRA_TRACK_CATALOG
import com.sample.musicx.service.MusicService.Companion.EXTRA_TRACK_INDEX
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.PlayerViewModel

class PlayerFragment : Fragment(), PlayerUI {

    private val args: PlayerFragmentArgs by navArgs()

    private lateinit var binding: FragmentPlayerBinding

    private val viewModel: PlayerViewModel by viewModels {
        InjectorUtils.providePlayerViewModelFactory(args.trackCatalog, args.startTrackIndex)
    }

    private lateinit var controller: MediaControllerCompat
    private val transportControls
        get() = controller.transportControls

    private var serviceBound = false
    private lateinit var musicService: MusicService

    private val connection = object : ServiceConnection {

        override fun onServiceDisconnected(name: ComponentName?) {
            serviceBound = false
        }

        override fun onServiceConnected(name: ComponentName?, service: IBinder?) {
            val binder = service as MusicService.MediaPlayerBinder
            musicService = binder.getService()
            serviceBound = true

            controller =
                MediaControllerCompat(musicService, musicService.mediaSession!!.sessionToken)

            controller.registerCallback(object : MediaControllerCompat.Callback() {
                override fun onPlaybackStateChanged(state: PlaybackStateCompat?) {
                    if (state != null) {
                        viewModel.updatePlaybackState(state)
                    }
                }

                override fun onMetadataChanged(metadata: MediaMetadataCompat?) {
                    if (metadata != null) {
                        viewModel.updateMediaMetadata(metadata)
                    }
                }

                override fun onRepeatModeChanged(repeatMode: Int) {
                    viewModel.updateLooping(repeatMode)
                }
            })
        }
    }

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlayerBinding.inflate(inflater, container, false)

        binding.viewModel = viewModel
        binding.playerUI = this
        binding.lifecycleOwner = this

        binding.backButton.setOnClickListener {
            findNavController().navigateUp()
        }

        binding.playerSeekBar.setOnTouchListener { _, _ -> true }

        return binding.root
    }

    override fun onStart() {
        super.onStart()

        Intent(context, MusicService::class.java).also { intent ->
            intent.putExtra(EXTRA_TRACK_CATALOG, args.trackCatalog)
            intent.putExtra(EXTRA_TRACK_INDEX, args.startTrackIndex)

            activity?.startService(intent)
            activity?.bindService(intent, connection, Context.BIND_AUTO_CREATE)
        }
    }

    override fun onStop() {
        super.onStop()
        serviceBound = false
        activity?.unbindService(connection)
        activity?.stopService(Intent(context, MusicService::class.java))
    }

    override fun onUIShowPlaylistPicker(view: View) {
        viewModel.showPlaylistPicker(requireFragmentManager())
    }

    override fun onUIPause(view: View) {
        transportControls.pause()
    }

    override fun onUIPlay(view: View) {
        transportControls.play()
    }

    override fun onUISkipToNext(view: View) {
        transportControls.skipToNext()
    }

    override fun onUISkipToPrevious(view: View) {
        transportControls.skipToPrevious()
    }

    override fun onUILooping(view: View) {
        val repeatMode =
            if (viewModel.isLooping.value == false) REPEAT_MODE_ONE
            else REPEAT_MODE_ALL

        transportControls.setRepeatMode(repeatMode)
    }
}

interface PlayerUI {
    fun onUIPause(view: View)
    fun onUIPlay(view: View)
    fun onUISkipToNext(view: View)
    fun onUILooping(view: View)
    fun onUISkipToPrevious(view: View)
    fun onUIShowPlaylistPicker(view: View)
}

object DataProviderManager {
    const val d = ""
}