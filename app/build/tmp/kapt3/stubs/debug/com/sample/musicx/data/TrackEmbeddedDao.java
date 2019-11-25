package com.sample.musicx.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\'J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\n\u001a\u00020\bH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\f\u001a\u00020\bH\'\u00a8\u0006\r"}, d2 = {"Lcom/sample/musicx/data/TrackEmbeddedDao;", "", "getTracks", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/TrackEmbedded;", "getTracksByAlbumId", "albumId", "", "getTracksByArtistId", "artistId", "getTracksByPlaylistId", "playlistId", "app_debug"})
public abstract interface TrackEmbeddedDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id ORDER BY tracks.title")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracks();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id WHERE tracks.artistId=:artistId ORDER BY tracks.title")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracksByArtistId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id WHERE tracks.albumId=:albumId ORDER BY tracks.title")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracksByAlbumId(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT tracks.id, tracks.title, albums.id as album_id, albums.title as album_title, albums.image as album_image, artists.id as artist_id, artists.name as artist_name, artists.photo as artist_photo, tracks.source, tracks.duration FROM tracks, playlist_build INNER JOIN albums ON tracks.albumId = albums.id INNER JOIN artists ON tracks.artistId = artists.id WHERE playlist_build.playlistId=:playlistId AND playlist_build.trackId = tracks.id ORDER BY tracks.title")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracksByPlaylistId(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistId);
}