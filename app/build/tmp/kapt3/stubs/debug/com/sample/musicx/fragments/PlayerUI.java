package com.sample.musicx.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000b"}, d2 = {"Lcom/sample/musicx/fragments/PlayerUI;", "", "onUILooping", "", "view", "Landroid/view/View;", "onUIPause", "onUIPlay", "onUIShowPlaylistPicker", "onUISkipToNext", "onUISkipToPrevious", "app_debug"})
public abstract interface PlayerUI {
    
    public abstract void onUIPause(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void onUIPlay(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void onUISkipToNext(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void onUILooping(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void onUISkipToPrevious(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    public abstract void onUIShowPlaylistPicker(@org.jetbrains.annotations.NotNull()
    android.view.View view);
}