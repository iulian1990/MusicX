package com.sample.musicx.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/musicx/viewmodels/ArtistViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/sample/musicx/handlers/ArtistHandler;", "repository", "Lcom/sample/musicx/data/ArtistRepository;", "(Lcom/sample/musicx/data/ArtistRepository;)V", "artists", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/Artist;", "getArtists", "()Landroidx/lifecycle/LiveData;", "showSongs", "", "view", "Landroid/view/View;", "artist", "app_debug"})
public final class ArtistViewModel extends androidx.lifecycle.ViewModel implements com.sample.musicx.handlers.ArtistHandler {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Artist>> artists = null;
    
    @java.lang.Override()
    public void showSongs(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.model.Artist artist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Artist>> getArtists() {
        return null;
    }
    
    public ArtistViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.ArtistRepository repository) {
        super();
    }
}