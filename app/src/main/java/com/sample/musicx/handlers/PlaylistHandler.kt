package com.sample.musicx.handlers

import android.view.View
import com.sample.musicx.model.Playlist

interface PlaylistHandler {
    fun showSongs(view: View, playlist: Playlist)
}
