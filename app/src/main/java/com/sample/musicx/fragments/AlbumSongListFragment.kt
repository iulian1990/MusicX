package com.sample.musicx.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.appbar.AppBarLayout
import com.sample.musicx.adapters.TrackAdapter
import com.sample.musicx.databinding.FragmentAlbumSongListBinding
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.SongListType
import com.sample.musicx.viewmodels.SongListViewModel

class AlbumSongListFragment : Fragment() {

    private val args: AlbumSongListFragmentArgs by navArgs()

    private val viewModel: SongListViewModel by viewModels {
        InjectorUtils.provideSongListViewModelFactory(
            requireContext(),
            SongListType.ALBUM,
            args.album.id
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentAlbumSongListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.album = args.album

        binding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        binding.appbar.addOnOffsetChangedListener(object : AppBarLayout.OnOffsetChangedListener {

            var isShow = true
            var scrollRange = -1

            override fun onOffsetChanged(appBarLayout: AppBarLayout, verticalOffset: Int) {
                // true for first call only
                if (scrollRange == -1) scrollRange = appBarLayout.totalScrollRange

                if (scrollRange + verticalOffset == 0) {
                    binding.toolbar.title = args.album.title
                    isShow = true
                } else if (isShow) {
                    binding.toolbar.title = null

                    isShow = false
                }
            }
        })


        binding.songListContent.songListRecyclerView.adapter =
            TrackAdapter(SongListType.ALBUM).also {
                subscribeUi(it, binding)
            }

        return binding.root
    }

    private fun subscribeUi(adapter: TrackAdapter, binding: FragmentAlbumSongListBinding) {
        viewModel.tracks.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }
}

