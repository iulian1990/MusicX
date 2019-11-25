package com.sample.musicx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.sample.musicx.adapters.AlbumAdapter
import com.sample.musicx.databinding.FragmentAlbumBinding
import com.sample.musicx.model.Album
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.AlbumViewModel

class AlbumFragment : Fragment() {

    private val viewModel: AlbumViewModel by viewModels {
        InjectorUtils.provideAlbumViewModelFactory(requireContext())
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentAlbumBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.albumRecyclerView.adapter = AlbumAdapter(viewModel).also {
            subscribeUi(it, binding)
        }

        return binding.root
    }

    private fun subscribeUi(adapter: AlbumAdapter, binding: FragmentAlbumBinding) {
        viewModel.albums.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }

}