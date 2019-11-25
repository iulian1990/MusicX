package com.sample.musicx.data;

import java.lang.System;

@androidx.room.Database(entities = {com.sample.musicx.model.Album.class, com.sample.musicx.model.Artist.class, com.sample.musicx.model.Playlist.class, com.sample.musicx.model.Track.class, com.sample.musicx.model.PlaylistBuilder.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&\u00a8\u0006\u0010"}, d2 = {"Lcom/sample/musicx/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "albumDao", "Lcom/sample/musicx/data/AlbumDao;", "artistDao", "Lcom/sample/musicx/data/ArtistDao;", "playlistBuilderDao", "Lcom/sample/musicx/data/PlaylistBuilderDao;", "playlistDao", "Lcom/sample/musicx/data/PlaylistDao;", "trackDao", "Lcom/sample/musicx/data/TrackDao;", "trackEmbeddedDao", "Lcom/sample/musicx/data/TrackEmbeddedDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    private static com.sample.musicx.data.AppDatabase instance;
    public static final com.sample.musicx.data.AppDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.musicx.data.AlbumDao albumDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.musicx.data.ArtistDao artistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.musicx.data.TrackDao trackDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.musicx.data.TrackEmbeddedDao trackEmbeddedDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.musicx.data.PlaylistDao playlistDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.sample.musicx.data.PlaylistBuilderDao playlistBuilderDao();
    
    public AppDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sample/musicx/data/AppDatabase$Companion;", "", "()V", "instance", "Lcom/sample/musicx/data/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.musicx.data.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final com.sample.musicx.data.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}