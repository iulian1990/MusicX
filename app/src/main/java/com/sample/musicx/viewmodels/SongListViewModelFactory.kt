package com.sample.musicx.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.musicx.data.TrackEmbeddedRepository

class SongListViewModelFactory(
    private val repository: TrackEmbeddedRepository,
    private val type: SongListType,
    val id: String
) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return SongListViewModel(repository, type, id) as T
    }
}
