package com.sample.musicx.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.sample.musicx.adapters.TrackAdapter
import com.sample.musicx.databinding.FragmentTrackBinding
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.SongListType
import com.sample.musicx.viewmodels.SongListViewModel

class TrackFragment : Fragment() {

    private val viewModel: SongListViewModel by viewModels {
        InjectorUtils.provideSongListViewModelFactory(requireContext(), SongListType.ALL)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentTrackBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this


        binding.trackRecyclerView.adapter = TrackAdapter(SongListType.ALL).also {
            subscribeUi(it, binding)
        }

        return binding.root
    }


    private fun subscribeUi(adapter: TrackAdapter, binding: FragmentTrackBinding) {
        viewModel.tracks.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }

}