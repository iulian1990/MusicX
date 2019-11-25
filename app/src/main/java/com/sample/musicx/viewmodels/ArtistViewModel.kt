package com.sample.musicx.viewmodels

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.sample.musicx.data.ArtistRepository
import com.sample.musicx.fragments.LibraryFragmentDirections
import com.sample.musicx.handlers.ArtistHandler
import com.sample.musicx.model.Album
import com.sample.musicx.model.Artist

class ArtistViewModel(repository: ArtistRepository) : ViewModel(), ArtistHandler {

    override fun showSongs(view: View, artist: Artist) {
        val direction = LibraryFragmentDirections.actionLibraryFragmentToArtistSongListFragment(artist)
        view.findNavController().navigate(direction)
    }

    val artists: LiveData<List<Artist>> = repository.getArtists()
}