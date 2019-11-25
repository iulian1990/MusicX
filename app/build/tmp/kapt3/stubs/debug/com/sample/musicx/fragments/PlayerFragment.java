package com.sample.musicx.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J&\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0017J\b\u0010\'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020(H\u0016J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020 H\u0016J\u0010\u0010,\u001a\u00020(2\u0006\u0010+\u001a\u00020 H\u0016J\u0010\u0010-\u001a\u00020(2\u0006\u0010+\u001a\u00020 H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010+\u001a\u00020 H\u0016J\u0010\u0010/\u001a\u00020(2\u0006\u0010+\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020(2\u0006\u0010+\u001a\u00020 H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0014\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00061"}, d2 = {"Lcom/sample/musicx/fragments/PlayerFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/sample/musicx/fragments/PlayerUI;", "()V", "args", "Lcom/sample/musicx/fragments/PlayerFragmentArgs;", "getArgs", "()Lcom/sample/musicx/fragments/PlayerFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "Lcom/sample/musicx/databinding/FragmentPlayerBinding;", "connection", "Landroid/content/ServiceConnection;", "controller", "Landroid/support/v4/media/session/MediaControllerCompat;", "musicService", "Lcom/sample/musicx/service/MusicService;", "serviceBound", "", "transportControls", "Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;", "kotlin.jvm.PlatformType", "getTransportControls", "()Landroid/support/v4/media/session/MediaControllerCompat$TransportControls;", "viewModel", "Lcom/sample/musicx/viewmodels/PlayerViewModel;", "getViewModel", "()Lcom/sample/musicx/viewmodels/PlayerViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "", "onStop", "onUILooping", "view", "onUIPause", "onUIPlay", "onUIShowPlaylistPicker", "onUISkipToNext", "onUISkipToPrevious", "app_debug"})
public final class PlayerFragment extends androidx.fragment.app.Fragment implements com.sample.musicx.fragments.PlayerUI {
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private com.sample.musicx.databinding.FragmentPlayerBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private android.support.v4.media.session.MediaControllerCompat controller;
    private boolean serviceBound;
    private com.sample.musicx.service.MusicService musicService;
    private final android.content.ServiceConnection connection = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.sample.musicx.fragments.PlayerFragmentArgs getArgs() {
        return null;
    }
    
    private final com.sample.musicx.viewmodels.PlayerViewModel getViewModel() {
        return null;
    }
    
    private final android.support.v4.media.session.MediaControllerCompat.TransportControls getTransportControls() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    public void onUIShowPlaylistPicker(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onUIPause(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onUIPlay(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onUISkipToNext(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onUISkipToPrevious(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onUILooping(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public PlayerFragment() {
        super();
    }
}