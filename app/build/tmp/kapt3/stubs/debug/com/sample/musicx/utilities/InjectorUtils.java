package com.sample.musicx.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u0006J \u0010!\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u001e\u00a8\u0006&"}, d2 = {"Lcom/sample/musicx/utilities/InjectorUtils;", "", "()V", "getAlbumRepository", "Lcom/sample/musicx/data/AlbumRepository;", "context", "Landroid/content/Context;", "getArtistRepository", "Lcom/sample/musicx/data/ArtistRepository;", "getPlaylistBuilderRepository", "Lcom/sample/musicx/data/PlaylistBuilderRepository;", "getPlaylistRepository", "Lcom/sample/musicx/data/PlaylistRepository;", "getTrackEmbeddedRepository", "Lcom/sample/musicx/data/TrackEmbeddedRepository;", "provideAlbumViewModelFactory", "Lcom/sample/musicx/viewmodels/AlbumViewModelFactory;", "provideArtistViewModelFactory", "Lcom/sample/musicx/viewmodels/ArtistViewModelFactory;", "providePlayerViewModelFactory", "Lcom/sample/musicx/viewmodels/PlayerViewModelFactory;", "catalog", "Lcom/sample/musicx/model/TrackCatalog;", "startTrackIndex", "", "providePlaylistPickerViewModelFactory", "Lcom/sample/musicx/viewmodels/PlaylistPickerViewModelFactory;", "application", "Landroid/app/Application;", "trackId", "", "providePlaylistViewModelFactory", "Lcom/sample/musicx/viewmodels/PlaylistViewModelFactory;", "provideSongListViewModelFactory", "Lcom/sample/musicx/viewmodels/SongListViewModelFactory;", "type", "Lcom/sample/musicx/viewmodels/SongListType;", "id", "app_debug"})
public final class InjectorUtils {
    public static final com.sample.musicx.utilities.InjectorUtils INSTANCE = null;
    
    private final com.sample.musicx.data.TrackEmbeddedRepository getTrackEmbeddedRepository(android.content.Context context) {
        return null;
    }
    
    private final com.sample.musicx.data.AlbumRepository getAlbumRepository(android.content.Context context) {
        return null;
    }
    
    private final com.sample.musicx.data.ArtistRepository getArtistRepository(android.content.Context context) {
        return null;
    }
    
    private final com.sample.musicx.data.PlaylistRepository getPlaylistRepository(android.content.Context context) {
        return null;
    }
    
    private final com.sample.musicx.data.PlaylistBuilderRepository getPlaylistBuilderRepository(android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.PlaylistPickerViewModelFactory providePlaylistPickerViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String trackId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.AlbumViewModelFactory provideAlbumViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.ArtistViewModelFactory provideArtistViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.PlaylistViewModelFactory providePlaylistViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.SongListViewModelFactory provideSongListViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.viewmodels.SongListType type, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.PlayerViewModelFactory providePlayerViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.model.TrackCatalog catalog, int startTrackIndex) {
        return null;
    }
    
    private InjectorUtils() {
        super();
    }
}