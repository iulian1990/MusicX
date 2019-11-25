package com.sample.musicx.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.sample.musicx.data.TrackEmbeddedRepository
import com.sample.musicx.model.TrackEmbedded
import com.sample.musicx.viewmodels.SongListType.*

class SongListViewModel(repository: TrackEmbeddedRepository, type: SongListType, id: String) :
    ViewModel() {

    val tracks: LiveData<List<TrackEmbedded>> = when (type) {
        ALBUM -> repository.getTracksByAlbumId(id)
        ARTIST -> repository.getTracksByArtistId(id)
        PLAYLIST -> repository.getTracksByPlaylistId(id)
        ALL -> repository.getTracks()
    }
}

enum class SongListType { ALBUM, ARTIST, PLAYLIST, ALL }