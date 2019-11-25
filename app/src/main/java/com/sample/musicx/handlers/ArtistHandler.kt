package com.sample.musicx.handlers

import android.view.View
import com.sample.musicx.model.Artist
import com.sample.musicx.model.Playlist

interface ArtistHandler {
    fun showSongs(view: View, artist: Artist)
}
