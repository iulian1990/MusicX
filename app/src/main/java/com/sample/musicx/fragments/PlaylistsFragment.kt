package com.sample.musicx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import com.sample.musicx.adapters.PlaylistAdapter
import com.sample.musicx.databinding.FragmentPlaylistsBinding
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.PlaylistViewModel

class PlaylistsFragment : Fragment() {

    lateinit var binding: FragmentPlaylistsBinding

    private val viewModel: PlaylistViewModel by activityViewModels {
        InjectorUtils.providePlaylistViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPlaylistsBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.newPlaylistLayout.setOnClickListener {
            val direction = LibraryFragmentDirections.actionLibraryFragmentToNewPlaylistFragment()
            findNavController().navigate(direction)
        }

        binding.playlistRecyclerView.adapter = PlaylistAdapter(viewModel).also {
            subscribeUi(it, binding)
        }

        return binding.root
    }

    private fun subscribeUi(adapter: PlaylistAdapter, binding: FragmentPlaylistsBinding) {
        viewModel.playlists.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }
}