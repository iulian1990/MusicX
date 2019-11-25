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
import com.sample.musicx.databinding.FragmentArtistSongListBinding
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.SongListType
import com.sample.musicx.viewmodels.SongListViewModel


class ArtistSongListFragment : Fragment() {

    private val args: ArtistSongListFragmentArgs by navArgs()

    private val viewModel: SongListViewModel by viewModels {
        InjectorUtils.provideSongListViewModelFactory(
            requireContext(),
            SongListType.ARTIST,
            args.artist.id
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentArtistSongListBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.artist = args.artist

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
                    binding.toolbar.title = args.artist.name
                    isShow = true
                } else if (isShow) {
                    binding.toolbar.title = null

                    isShow = false
                }
            }
        })


        binding.songListContent.songListRecyclerView.adapter = TrackAdapter(SongListType.ARTIST).also {
            subscribeUi(it)
        }

        return binding.root
    }

    private fun subscribeUi(adapter: TrackAdapter) {
        viewModel.tracks.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }
}

