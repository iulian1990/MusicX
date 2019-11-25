package com.sample.musicx.fragments

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import androidx.core.os.bundleOf
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import com.sample.musicx.adapters.PlaylistPickerAdapter
import com.sample.musicx.databinding.DialogPlaylistPickerBinding
import com.sample.musicx.handlers.PlaylistPickerHandler
import com.sample.musicx.model.Playlist
import com.sample.musicx.model.PlaylistBuilder
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.PlaylistPickerViewModel

class PlaylistPickerDialogFragment : DialogFragment(), PlaylistPickerHandler {

    private lateinit var binding: DialogPlaylistPickerBinding

    private var trackId: String? = ""

    private val viewModel: PlaylistPickerViewModel by activityViewModels {
        InjectorUtils.providePlaylistPickerViewModelFactory(
            requireActivity().application,
            trackId!!
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trackId = arguments?.getString(TRACK_ID_ARG)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        return activity?.let {

            binding = DialogPlaylistPickerBinding.inflate(requireActivity().layoutInflater)

            val builder = AlertDialog.Builder(it)
                .setTitle("Pick a playlist")
                .setView(binding.root)

            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        PlaylistPickerAdapter(this).also { adapter ->
            binding.playlistPickerRecyclerView.adapter = adapter
            subscribeUi(adapter, binding)
        }

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun pick(view: View, playlist: Playlist) {
        trackId?.let {
            viewModel.addToPlaylistBuilder(PlaylistBuilder(playlist.id, it))
            dismiss()
        }
    }

    private fun subscribeUi(adapter: PlaylistPickerAdapter, binding: DialogPlaylistPickerBinding) {
        viewModel.playlists.observe(requireActivity()) { list ->
            adapter.submitList(list)
        }
    }

    companion object {

        const val TRACK_ID_ARG = "TRACK_ID"

        fun newInstance(trackId: String): PlaylistPickerDialogFragment {
            return PlaylistPickerDialogFragment().apply {
                arguments = bundleOf(TRACK_ID_ARG to trackId)
            }
        }
    }
}