package com.sample.musicx.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/sample/musicx/data/AlbumDao;", "Lcom/sample/musicx/data/BaseDao;", "Lcom/sample/musicx/model/Album;", "getAlbums", "Landroidx/lifecycle/LiveData;", "", "app_debug"})
public abstract interface AlbumDao extends com.sample.musicx.data.BaseDao<com.sample.musicx.model.Album> {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM albums ORDER BY title")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.sample.musicx.model.Album>> getAlbums();
}