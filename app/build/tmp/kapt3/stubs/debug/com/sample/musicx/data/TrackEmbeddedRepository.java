package com.sample.musicx.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000bJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/musicx/data/TrackEmbeddedRepository;", "", "trackEmbeddedDao", "Lcom/sample/musicx/data/TrackEmbeddedDao;", "(Lcom/sample/musicx/data/TrackEmbeddedDao;)V", "getTracks", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/TrackEmbedded;", "getTracksByAlbumId", "albumId", "", "getTracksByArtistId", "artistId", "getTracksByPlaylistId", "playlistId", "Companion", "app_debug"})
public final class TrackEmbeddedRepository {
    private final com.sample.musicx.data.TrackEmbeddedDao trackEmbeddedDao = null;
    private static com.sample.musicx.data.TrackEmbeddedRepository instance;
    public static final com.sample.musicx.data.TrackEmbeddedRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracksByAlbumId(@org.jetbrains.annotations.NotNull()
    java.lang.String albumId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracksByArtistId(@org.jetbrains.annotations.NotNull()
    java.lang.String artistId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracksByPlaylistId(@org.jetbrains.annotations.NotNull()
    java.lang.String playlistId) {
        return null;
    }
    
    private TrackEmbeddedRepository(com.sample.musicx.data.TrackEmbeddedDao trackEmbeddedDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sample/musicx/data/TrackEmbeddedRepository$Companion;", "", "()V", "instance", "Lcom/sample/musicx/data/TrackEmbeddedRepository;", "getInstance", "trackEmbeddedDao", "Lcom/sample/musicx/data/TrackEmbeddedDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.musicx.data.TrackEmbeddedRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.sample.musicx.data.TrackEmbeddedDao trackEmbeddedDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}