package com.sample.musicx.handlers

import android.view.View
import com.sample.musicx.model.Album

interface AlbumHandler {
    fun showSongs(view: View, album: Album)
}
