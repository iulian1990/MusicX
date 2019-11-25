package com.sample.musicx.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 ,2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003,-.B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\"\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u00182\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eH\u0016J\u0012\u0010\'\u001a\u00020 2\b\u0010$\u001a\u0004\u0018\u00010\u0018H\u0016J\"\u0010(\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000eH\u0016J\u0012\u0010+\u001a\u00020#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u0012\u0010\u0005\u001a\u00060\u0006R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/sample/musicx/service/MusicService;", "Landroid/app/Service;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnErrorListener;", "()V", "binder", "Lcom/sample/musicx/service/MusicService$MediaPlayerBinder;", "catalog", "Lcom/sample/musicx/model/TrackCatalog;", "currTrack", "Lcom/sample/musicx/model/TrackEmbedded;", "getCurrTrack", "()Lcom/sample/musicx/model/TrackEmbedded;", "currTrackIndex", "", "mediaSession", "Landroid/support/v4/media/session/MediaSessionCompat;", "getMediaSession", "()Landroid/support/v4/media/session/MediaSessionCompat;", "setMediaSession", "(Landroid/support/v4/media/session/MediaSessionCompat;)V", "metadataBuilder", "Landroid/support/v4/media/MediaMetadataCompat$Builder;", "player", "Landroid/media/MediaPlayer;", "stateBuilder", "Landroid/support/v4/media/session/PlaybackStateCompat$Builder;", "onBind", "Landroid/os/IBinder;", "intent", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onError", "", "mp", "what", "extra", "onPrepared", "onStartCommand", "flags", "startId", "onUnbind", "Companion", "MediaPlayerBinder", "MediaSessionCallback", "app_debug"})
public final class MusicService extends android.app.Service implements android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnErrorListener {
    private android.media.MediaPlayer player;
    @org.jetbrains.annotations.Nullable()
    private android.support.v4.media.session.MediaSessionCompat mediaSession;
    private android.support.v4.media.session.PlaybackStateCompat.Builder stateBuilder;
    private android.support.v4.media.MediaMetadataCompat.Builder metadataBuilder;
    private int currTrackIndex;
    private com.sample.musicx.model.TrackCatalog catalog;
    private final com.sample.musicx.service.MusicService.MediaPlayerBinder binder = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TRACK_CATALOG = "track_catalog";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TRACK_INDEX = "track_index";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MEDIA_SESSION_TAG = "media_session";
    public static final com.sample.musicx.service.MusicService.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    public final android.support.v4.media.session.MediaSessionCompat getMediaSession() {
        return null;
    }
    
    public final void setMediaSession(@org.jetbrains.annotations.Nullable()
    android.support.v4.media.session.MediaSessionCompat p0) {
    }
    
    private final com.sample.musicx.model.TrackEmbedded getCurrTrack() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public int onStartCommand(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent, int flags, int startId) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.os.IBinder onBind(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
        return null;
    }
    
    @java.lang.Override()
    public boolean onUnbind(@org.jetbrains.annotations.Nullable()
    android.content.Intent intent) {
        return false;
    }
    
    @java.lang.Override()
    public void onPrepared(@org.jetbrains.annotations.Nullable()
    android.media.MediaPlayer mp) {
    }
    
    @java.lang.Override()
    public boolean onError(@org.jetbrains.annotations.Nullable()
    android.media.MediaPlayer mp, int what, int extra) {
        return false;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public MusicService() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/sample/musicx/service/MusicService$MediaPlayerBinder;", "Landroid/os/Binder;", "(Lcom/sample/musicx/service/MusicService;)V", "getService", "Lcom/sample/musicx/service/MusicService;", "app_debug"})
    public final class MediaPlayerBinder extends android.os.Binder {
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.musicx.service.MusicService getService() {
            return null;
        }
        
        public MediaPlayerBinder() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/sample/musicx/service/MusicService$MediaSessionCallback;", "Landroid/support/v4/media/session/MediaSessionCompat$Callback;", "(Lcom/sample/musicx/service/MusicService;)V", "onPause", "", "onPlay", "onSetRepeatMode", "repeatMode", "", "onSkipToNext", "onSkipToPrevious", "app_debug"})
    public final class MediaSessionCallback extends android.support.v4.media.session.MediaSessionCompat.Callback {
        
        @java.lang.Override()
        public void onPause() {
        }
        
        @java.lang.Override()
        public void onPlay() {
        }
        
        @android.annotation.SuppressLint(value = {"SwitchIntDef"})
        @java.lang.Override()
        public void onSetRepeatMode(int repeatMode) {
        }
        
        @java.lang.Override()
        public void onSkipToPrevious() {
        }
        
        @java.lang.Override()
        public void onSkipToNext() {
        }
        
        public MediaSessionCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/sample/musicx/service/MusicService$Companion;", "", "()V", "EXTRA_TRACK_CATALOG", "", "EXTRA_TRACK_INDEX", "MEDIA_SESSION_TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}