package com.sample.musicx.viewmodels

import android.app.Application
import android.view.View
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.sample.musicx.data.PlaylistBuilderRepository
import com.sample.musicx.data.PlaylistRepository
import com.sample.musicx.handlers.PlaylistPickerHandler
import com.sample.musicx.model.Playlist
import com.sample.musicx.model.PlaylistBuilder
import kotlinx.coroutines.launch

class PlaylistPickerViewModel(
    application: Application,
    private val trackId: String,
    private val playlistRepository: PlaylistRepository,
    private val playlistBuilderRepository: PlaylistBuilderRepository
) : AndroidViewModel(application)
     {

    val playlists: LiveData<List<Playlist>> = playlistRepository.getPlaylists()



     fun addToPlaylistBuilder(playlistBuilder: PlaylistBuilder) {
        viewModelScope.launch {

            val newId = playlistBuilderRepository.insert(playlistBuilder)

            val message = if (newId == -1L) {
                "Track already added to playlist!"
            } else {
                "Track was added to playlist!"
            }

            Toast.makeText(getApplication(), message, Toast.LENGTH_SHORT).show()
        }
    }
}
