package com.sample.musicx.data;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\tJ\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\'J\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/musicx/data/BaseDao;", "T", "", "delete", "", "t", "(Ljava/lang/Object;)V", "insert", "", "(Ljava/lang/Object;)J", "insertAll", "", "ts", "update", "app_debug"})
public abstract interface BaseDao<T extends java.lang.Object> {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract long insert(T t);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.util.List<java.lang.Long> insertAll(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> ts);
    
    @androidx.room.Delete()
    public abstract void delete(T t);
    
    @androidx.room.Update()
    public abstract void update(T t);
}