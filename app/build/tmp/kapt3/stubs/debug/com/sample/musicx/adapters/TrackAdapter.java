package com.sample.musicx.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0001\u0016B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0002J\u001c\u0010\u000f\u001a\u00020\u00102\n\u0010\u0011\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\u0012\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0017"}, d2 = {"Lcom/sample/musicx/adapters/TrackAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/sample/musicx/model/TrackEmbedded;", "Lcom/sample/musicx/adapters/TrackAdapter$TrackViewHolder;", "type", "Lcom/sample/musicx/viewmodels/SongListType;", "(Lcom/sample/musicx/viewmodels/SongListType;)V", "getType", "()Lcom/sample/musicx/viewmodels/SongListType;", "createOnClickListener", "Landroid/view/View$OnClickListener;", "position", "", "getItems", "", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TrackViewHolder", "app_debug"})
public final class TrackAdapter extends androidx.recyclerview.widget.ListAdapter<com.sample.musicx.model.TrackEmbedded, com.sample.musicx.adapters.TrackAdapter.TrackViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final com.sample.musicx.viewmodels.SongListType type = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.sample.musicx.adapters.TrackAdapter.TrackViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.adapters.TrackAdapter.TrackViewHolder holder, int position) {
    }
    
    private final android.view.View.OnClickListener createOnClickListener(int position) {
        return null;
    }
    
    private final java.util.List<com.sample.musicx.model.TrackEmbedded> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.musicx.viewmodels.SongListType getType() {
        return null;
    }
    
    public TrackAdapter(@org.jetbrains.annotations.NotNull()
    com.sample.musicx.viewmodels.SongListType type) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sample/musicx/adapters/TrackAdapter$TrackViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/sample/musicx/databinding/ItemTrackBinding;", "(Lcom/sample/musicx/adapters/TrackAdapter;Lcom/sample/musicx/databinding/ItemTrackBinding;)V", "bind", "", "track", "Lcom/sample/musicx/model/TrackEmbedded;", "app_debug"})
    public final class TrackViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.sample.musicx.databinding.ItemTrackBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.sample.musicx.model.TrackEmbedded track) {
        }
        
        public TrackViewHolder(@org.jetbrains.annotations.NotNull()
        com.sample.musicx.databinding.ItemTrackBinding binding) {
            super(null);
        }
    }
}