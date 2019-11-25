package com.sample.musicx.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import com.sample.musicx.adapters.ArtistAdapter
import com.sample.musicx.databinding.FragmentArtistBinding
import com.sample.musicx.utilities.InjectorUtils
import com.sample.musicx.viewmodels.ArtistViewModel

class ArtistFragment : Fragment() {

    private val viewModel: ArtistViewModel by viewModels {
        InjectorUtils.provideArtistViewModelFactory(requireContext())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = FragmentArtistBinding.inflate(inflater, container, false)
        binding.lifecycleOwner = this

        binding.artistRecyclerView.adapter = ArtistAdapter(viewModel).also {
            subscribeUi(it, binding)
        }

        return binding.root
    }

    private fun subscribeUi(adapter: ArtistAdapter, binding: FragmentArtistBinding) {
        viewModel.artists.observe(viewLifecycleOwner) { list ->
            adapter.submitList(list)
        }
    }
}