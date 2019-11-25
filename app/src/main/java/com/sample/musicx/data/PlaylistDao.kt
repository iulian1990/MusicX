package com.sample.musicx.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.sample.musicx.model.Playlist

@Dao
interface PlaylistDao : BaseDao<Playlist> {
    @Query("SELECT * FROM playlists")
    fun getPlaylists(): LiveData<List<Playlist>>
}