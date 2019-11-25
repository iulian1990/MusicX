package com.sample.musicx.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.musicx.data.PlaylistRepository

class PlaylistViewModelFactory(private val repository: PlaylistRepository) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlaylistViewModel(repository) as T
    }
}
