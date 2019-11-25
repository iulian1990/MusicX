package com.sample.musicx.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0017H\u0002J\u000e\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0010R\u001f\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/sample/musicx/viewmodels/PlayerViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "elapsedTime", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getElapsedTime", "()Landroidx/lifecycle/MutableLiveData;", "isLooping", "", "isPlaying", "mediaMetadata", "Lcom/sample/musicx/viewmodels/NowPlayingMetadata;", "getMediaMetadata", "playbackState", "Landroid/support/v4/media/session/PlaybackStateCompat;", "getPlaybackState", "setPlaybackState", "(Landroidx/lifecycle/MutableLiveData;)V", "timer", "Ljava/util/Timer;", "showPlaylistPicker", "", "fm", "Landroidx/fragment/app/FragmentManager;", "updateElapsedTime", "updateLooping", "repeatMode", "", "updateMediaMetadata", "Landroid/support/v4/media/MediaMetadataCompat;", "updatePlaybackState", "app_debug"})
public final class PlayerViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.sample.musicx.viewmodels.NowPlayingMetadata> mediaMetadata = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<android.support.v4.media.session.PlaybackStateCompat> playbackState;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlaying = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLooping = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Long> elapsedTime = null;
    private java.util.Timer timer;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.sample.musicx.viewmodels.NowPlayingMetadata> getMediaMetadata() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.support.v4.media.session.PlaybackStateCompat> getPlaybackState() {
        return null;
    }
    
    public final void setPlaybackState(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<android.support.v4.media.session.PlaybackStateCompat> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isPlaying() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLooping() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Long> getElapsedTime() {
        return null;
    }
    
    public final void showPlaylistPicker(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentManager fm) {
    }
    
    public final void updatePlaybackState(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.session.PlaybackStateCompat playbackState) {
    }
    
    public final void updateLooping(int repeatMode) {
    }
    
    public final void updateMediaMetadata(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat mediaMetadata) {
    }
    
    private final void updateElapsedTime() {
    }
    
    public PlayerViewModel() {
        super();
    }
}