package com.sample.musicx.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/sample/musicx/viewmodels/SongListViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/sample/musicx/data/TrackEmbeddedRepository;", "type", "Lcom/sample/musicx/viewmodels/SongListType;", "id", "", "(Lcom/sample/musicx/data/TrackEmbeddedRepository;Lcom/sample/musicx/viewmodels/SongListType;Ljava/lang/String;)V", "tracks", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/TrackEmbedded;", "getTracks", "()Landroidx/lifecycle/LiveData;", "app_debug"})
public final class SongListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> tracks = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.TrackEmbedded>> getTracks() {
        return null;
    }
    
    public SongListViewModel(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.TrackEmbeddedRepository repository, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.viewmodels.SongListType type, @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        super();
    }
}