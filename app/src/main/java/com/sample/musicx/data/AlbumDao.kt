package com.sample.musicx.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.sample.musicx.model.Album

@Dao
interface AlbumDao : BaseDao<Album> {
    @Query("SELECT * FROM albums ORDER BY title")
    fun getAlbums(): LiveData<List<Album>>
}