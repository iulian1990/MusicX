package com.sample.musicx.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/sample/musicx/viewmodels/PlaylistPickerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "trackId", "", "playlistRepository", "Lcom/sample/musicx/data/PlaylistRepository;", "playlistBuilderRepository", "Lcom/sample/musicx/data/PlaylistBuilderRepository;", "(Landroid/app/Application;Ljava/lang/String;Lcom/sample/musicx/data/PlaylistRepository;Lcom/sample/musicx/data/PlaylistBuilderRepository;)V", "playlists", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/Playlist;", "getPlaylists", "()Landroidx/lifecycle/LiveData;", "addToPlaylistBuilder", "", "playlistBuilder", "Lcom/sample/musicx/model/PlaylistBuilder;", "app_debug"})
public final class PlaylistPickerViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Playlist>> playlists = null;
    private final java.lang.String trackId = null;
    private final com.sample.musicx.data.PlaylistRepository playlistRepository = null;
    private final com.sample.musicx.data.PlaylistBuilderRepository playlistBuilderRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Playlist>> getPlaylists() {
        return null;
    }
    
    public final void addToPlaylistBuilder(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.model.PlaylistBuilder playlistBuilder) {
    }
    
    public PlaylistPickerViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String trackId, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.PlaylistRepository playlistRepository, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.PlaylistBuilderRepository playlistBuilderRepository) {
        super(null);
    }
}