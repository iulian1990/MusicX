package com.sample.musicx.utilities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\".\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\b\"\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\f*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\".\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\r\u0010\b\"\u0004\b\u000f\u0010\n\"\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0005\".\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\n\"\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005\".\u0010\u0013\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\n\"\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0005\".\u0010\u0016\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0017\u0010\b\"\u0004\b\u0018\u0010\n\"\u0016\u0010\u0019\u001a\u00020\u001a*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c\"*\u0010\u0019\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u001a8\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\u001d\"\u0004\b\u001e\u0010\u001f\"\u0016\u0010 \u001a\u00020\u0001*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0005\"*\u0010 \u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n\".\u0010#\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010\b\"\u0004\b%\u0010\n\"\u0018\u0010&\u001a\u0004\u0018\u00010\u0001*\u00020\u00038\u00c6\u0002\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0005\".\u0010&\u001a\u0004\u0018\u00010\u0001*\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u00c7\u0002@\u00c6\u0002X\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\'\u0010\b\"\u0004\b(\u0010\n\u00a8\u0006)"}, d2 = {"NO_GET", "", "album", "Landroid/support/v4/media/MediaMetadataCompat;", "getAlbum", "(Landroid/support/v4/media/MediaMetadataCompat;)Ljava/lang/String;", "value", "Landroid/support/v4/media/MediaMetadataCompat$Builder;", "(Landroid/support/v4/media/MediaMetadataCompat$Builder;)Ljava/lang/String;", "setAlbum", "(Landroid/support/v4/media/MediaMetadataCompat$Builder;Ljava/lang/String;)V", "albumArtUri", "Landroid/net/Uri;", "getAlbumArtUri", "(Landroid/support/v4/media/MediaMetadataCompat;)Landroid/net/Uri;", "setAlbumArtUri", "artist", "getArtist", "setArtist", "displaySubtitle", "getDisplaySubtitle", "setDisplaySubtitle", "displayTitle", "getDisplayTitle", "setDisplayTitle", "duration", "", "getDuration", "(Landroid/support/v4/media/MediaMetadataCompat;)J", "(Landroid/support/v4/media/MediaMetadataCompat$Builder;)J", "setDuration", "(Landroid/support/v4/media/MediaMetadataCompat$Builder;J)V", "id", "getId", "setId", "mediaUri", "getMediaUri", "setMediaUri", "title", "getTitle", "setTitle", "app_debug"})
public final class MediaMetadataCompatExtKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NO_GET = "Property does not have a \'get\'";
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getId(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$title) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDisplayTitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$displayTitle) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDisplaySubtitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$displaySubtitle) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getArtist(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$artist) {
        return null;
    }
    
    public static final long getDuration(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$duration) {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getAlbum(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$album) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.net.Uri getAlbumArtUri(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat $this$albumArtUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String getId(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$id) {
        return null;
    }
    
    public static final void setId(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$id, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$title) {
        return null;
    }
    
    public static final void setTitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$title, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getArtist(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$artist) {
        return null;
    }
    
    public static final void setArtist(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$artist, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getAlbum(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$album) {
        return null;
    }
    
    public static final void setAlbum(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$album, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    public static final long getDuration(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$duration) {
        return 0L;
    }
    
    public static final void setDuration(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$duration, long value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getMediaUri(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$mediaUri) {
        return null;
    }
    
    public static final void setMediaUri(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$mediaUri, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getAlbumArtUri(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$albumArtUri) {
        return null;
    }
    
    public static final void setAlbumArtUri(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$albumArtUri, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDisplayTitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$displayTitle) {
        return null;
    }
    
    public static final void setDisplayTitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$displayTitle, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public static final java.lang.String getDisplaySubtitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$displaySubtitle) {
        return null;
    }
    
    public static final void setDisplaySubtitle(@org.jetbrains.annotations.NotNull()
    android.support.v4.media.MediaMetadataCompat.Builder $this$displaySubtitle, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
}