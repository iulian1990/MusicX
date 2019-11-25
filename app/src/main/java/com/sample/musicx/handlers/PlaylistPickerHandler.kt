package com.sample.musicx.handlers

import android.view.View
import com.sample.musicx.model.Playlist

interface PlaylistPickerHandler {
    fun pick(view: View, playlist: Playlist)
}
