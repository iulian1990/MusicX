package com.sample.musicx.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\tH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/sample/musicx/viewmodels/PlaylistViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/sample/musicx/handlers/PlaylistHandler;", "repository", "Lcom/sample/musicx/data/PlaylistRepository;", "(Lcom/sample/musicx/data/PlaylistRepository;)V", "playlists", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/Playlist;", "getPlaylists", "()Landroidx/lifecycle/LiveData;", "insert", "", "playlist", "showSongs", "view", "Landroid/view/View;", "app_debug"})
public final class PlaylistViewModel extends androidx.lifecycle.ViewModel implements com.sample.musicx.handlers.PlaylistHandler {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Playlist>> playlists = null;
    private final com.sample.musicx.data.PlaylistRepository repository = null;
    
    @java.lang.Override()
    public void showSongs(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.model.Playlist playlist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Playlist>> getPlaylists() {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.model.Playlist playlist) {
    }
    
    public PlaylistViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.PlaylistRepository repository) {
        super();
    }
}