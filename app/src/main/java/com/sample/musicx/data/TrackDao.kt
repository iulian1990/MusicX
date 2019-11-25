package com.sample.musicx.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.sample.musicx.model.Track

@Dao
interface TrackDao : BaseDao<Track> {

    /* @Query("SELECT * FROM tracks ORDER BY title")
    fun getTracks(): LiveData<List<Track>>

    @Query("SELECT * FROM tracks WHERE artistId=:artistId ORDER BY title")
    fun getTracksByArtistId(artistId: String): LiveData<List<Track>>

    @Query("SELECT * FROM tracks WHERE albumId=:albumId ORDER BY title")
    fun getTracksByAlbumId(albumId: String): LiveData<List<Track>> */
}