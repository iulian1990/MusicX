package com.sample.musicx.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.musicx.data.PlaylistBuilderRepository
import com.sample.musicx.data.PlaylistRepository

class PlaylistPickerViewModelFactory(
    private val application: Application,
    private val trackId: String,
    private val playlistRepository: PlaylistRepository,
    private val playlistBuilderRepository: PlaylistBuilderRepository
) :
    ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return PlaylistPickerViewModel(
            application,
            trackId,
            playlistRepository,
            playlistBuilderRepository
        ) as T
    }
}
