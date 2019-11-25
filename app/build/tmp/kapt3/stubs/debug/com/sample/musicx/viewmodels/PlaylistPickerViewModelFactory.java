package com.sample.musicx.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\'\u0010\u000b\u001a\u0002H\f\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/musicx/viewmodels/PlaylistPickerViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "application", "Landroid/app/Application;", "trackId", "", "playlistRepository", "Lcom/sample/musicx/data/PlaylistRepository;", "playlistBuilderRepository", "Lcom/sample/musicx/data/PlaylistBuilderRepository;", "(Landroid/app/Application;Ljava/lang/String;Lcom/sample/musicx/data/PlaylistRepository;Lcom/sample/musicx/data/PlaylistBuilderRepository;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class PlaylistPickerViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    private final android.app.Application application = null;
    private final java.lang.String trackId = null;
    private final com.sample.musicx.data.PlaylistRepository playlistRepository = null;
    private final com.sample.musicx.data.PlaylistBuilderRepository playlistBuilderRepository = null;
    
    @kotlin.Suppress(names = {"UNCHECKED_CAST"})
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
    
    public PlaylistPickerViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.app.Application application, @org.jetbrains.annotations.NotNull()
    java.lang.String trackId, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.PlaylistRepository playlistRepository, @org.jetbrains.annotations.NotNull()
    com.sample.musicx.data.PlaylistBuilderRepository playlistBuilderRepository) {
        super();
    }
}