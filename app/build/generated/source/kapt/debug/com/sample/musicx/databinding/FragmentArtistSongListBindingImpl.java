package com.sample.musicx.databinding;
import com.sample.musicx.R;
import com.sample.musicx.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentArtistSongListBindingImpl extends FragmentArtistSongListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(8);
        sIncludes.setIncludes(3, 
            new String[] {"song_list_content"},
            new int[] {4},
            new int[] {com.sample.musicx.R.layout.song_list_content});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 5);
        sViewsWithIds.put(R.id.collapsing_toolbar_layout, 6);
        sViewsWithIds.put(R.id.toolbar, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentArtistSongListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentArtistSongListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[6]
            , (com.sample.musicx.databinding.SongListContentBinding) bindings[4]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            );
        this.appBarImage.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (androidx.core.widget.NestedScrollView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        songListContent.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (songListContent.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.artist == variableId) {
            setArtist((com.sample.musicx.model.Artist) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setArtist(@Nullable com.sample.musicx.model.Artist Artist) {
        this.mArtist = Artist;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.artist);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        songListContent.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSongListContent((com.sample.musicx.databinding.SongListContentBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSongListContent(com.sample.musicx.databinding.SongListContentBinding SongListContent, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.sample.musicx.model.Artist artist = mArtist;
        java.lang.String artistPhoto = null;
        java.lang.String artistName = null;

        if ((dirtyFlags & 0x6L) != 0) {



                if (artist != null) {
                    // read artist.photo
                    artistPhoto = artist.getPhoto();
                    // read artist.name
                    artistName = artist.getName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindRoundedImageFromUri(this.appBarImage, artistPhoto);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, artistName);
        }
        executeBindingsOn(songListContent);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): songListContent
        flag 1 (0x2L): artist
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}