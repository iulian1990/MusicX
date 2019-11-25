package com.sample.musicx.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sample.musicx.data.ArtistRepository

class ArtistViewModelFactory(private val repository: ArtistRepository) : ViewModelProvider.Factory {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ArtistViewModel(repository) as T
    }
}
