package com.sample.musicx.viewmodels

import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import com.sample.musicx.data.PlaylistRepository
import com.sample.musicx.fragments.LibraryFragmentDirections
import com.sample.musicx.handlers.PlaylistHandler
import com.sample.musicx.model.Playlist
import kotlinx.coroutines.launch

class PlaylistViewModel(private val repository: PlaylistRepository) : ViewModel(), PlaylistHandler {

    override fun showSongs(view: View, playlist: Playlist) {
        val direction =
            LibraryFragmentDirections.actionLibraryFragmentToPlaylistSongListFragment(playlist)
        view.findNavController().navigate(direction)
    }

    val playlists: LiveData<List<Playlist>> = repository.getPlaylists()

    fun insert(playlist: Playlist) {
        viewModelScope.launch {
            repository.insert(playlist)
        }
    }
}
