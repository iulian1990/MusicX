package com.sample.musicx.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/musicx/data/PlaylistRepository;", "", "playlistDao", "Lcom/sample/musicx/data/PlaylistDao;", "(Lcom/sample/musicx/data/PlaylistDao;)V", "getPlaylists", "Landroidx/lifecycle/LiveData;", "", "Lcom/sample/musicx/model/Playlist;", "insert", "", "playlist", "(Lcom/sample/musicx/model/Playlist;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public final class PlaylistRepository {
    private final com.sample.musicx.data.PlaylistDao playlistDao = null;
    private static com.sample.musicx.data.PlaylistRepository instance;
    public static final com.sample.musicx.data.PlaylistRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Playlist>> getPlaylists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insert(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.model.Playlist playlist, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    private PlaylistRepository(com.sample.musicx.data.PlaylistDao playlistDao) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sample/musicx/data/PlaylistRepository$Companion;", "", "()V", "instance", "Lcom/sample/musicx/data/PlaylistRepository;", "getInstance", "playlistDao", "Lcom/sample/musicx/data/PlaylistDao;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.sample.musicx.data.PlaylistRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.sample.musicx.data.PlaylistDao playlistDao) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}