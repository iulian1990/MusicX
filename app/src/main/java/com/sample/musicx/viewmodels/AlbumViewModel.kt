package com.sample.musicx.viewmodels

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import com.sample.musicx.data.AlbumRepository
import com.sample.musicx.fragments.LibraryFragmentDirections
import com.sample.musicx.handlers.AlbumHandler
import com.sample.musicx.model.Album

class AlbumViewModel(repository: AlbumRepository) : ViewModel(), AlbumHandler {

    override fun showSongs(view: View, album: Album) {
        val direction = LibraryFragmentDirections.actionLibraryFragmentToAlbumSongListFragment(album)

        view.findNavController().navigate(direction)
    }

    val albums: LiveData<List<Album>> = repository.getAlbums()
}
