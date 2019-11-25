package com.sample.musicx.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sample.musicx.model.Artist
import com.sample.musicx.model.Playlist

@Dao
interface ArtistDao  : BaseDao<Artist> {

    @Query("SELECT * FROM artists ORDER BY name")
    fun getArtists(): LiveData<List<Artist>>
}