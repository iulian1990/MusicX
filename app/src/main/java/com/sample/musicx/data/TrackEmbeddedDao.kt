package com.sample.musicx.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.sample.musicx.model.TrackEmbedded

@Dao
interface TrackEmbeddedDao {
    @Query(
        "SELECT tracks.id, tracks.title, " +
                "albums.id as album_id, albums.title as album_title, albums.image as album_image, " +
                "artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, " +
                "tracks.source, tracks.duration " +
                "FROM tracks " +
                "INNER JOIN albums ON tracks.albumId = albums.id " +
                "INNER JOIN artists ON tracks.artistId = artists.id " +
                "ORDER BY tracks.title"
    )
    fun getTracks(): LiveData<List<TrackEmbedded>>

    @Query(
        "SELECT tracks.id, tracks.title, " +
                "albums.id as album_id, albums.title as album_title, albums.image as album_image, " +
                "artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, " +
                "tracks.source, tracks.duration " +
                "FROM tracks " +
                "INNER JOIN albums ON tracks.albumId = albums.id " +
                "INNER JOIN artists ON tracks.artistId = artists.id " +
                "WHERE tracks.artistId=:artistId ORDER BY tracks.title"
    )
    fun getTracksByArtistId(artistId: String): LiveData<List<TrackEmbedded>>

    @Query(
        "SELECT tracks.id, tracks.title, " +
                "albums.id as album_id, albums.title as album_title, albums.image as album_image, " +
                "artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, " +
                "tracks.source, tracks.duration " +
                "FROM tracks " +
                "INNER JOIN albums ON tracks.albumId = albums.id " +
                "INNER JOIN artists ON tracks.artistId = artists.id " +
                "WHERE tracks.albumId=:albumId ORDER BY tracks.title"
    )
    fun getTracksByAlbumId(albumId: String): LiveData<List<TrackEmbedded>>

    @Query(
        "SELECT tracks.id, tracks.title, " +
                "albums.id as album_id, albums.title as album_title, albums.image as album_image, " +
                "artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, " +
                "tracks.source, tracks.duration " +
                "FROM tracks, playlist_build " +
                "INNER JOIN albums ON tracks.albumId = albums.id " +
                "INNER JOIN artists ON tracks.artistId = artists.id " +
                "WHERE playlist_build.playlistId=:playlistId " +
                "AND playlist_build.trackId = tracks.id ORDER BY tracks.title"
    )
    fun getTracksByPlaylistId(playlistId: String): LiveData<List<TrackEmbedded>>

}