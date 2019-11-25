package com.sample.musicx.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.musicx.model.TrackCatalog

class PlayerViewModelFactory(private val catalog: TrackCatalog, private val startTrackIndex: Int) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlayerViewModel() as T
    }
}
