package com.sample.musicx.databinding;
import com.sample.musicx.R;
import com.sample.musicx.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTrackBindingImpl extends ItemTrackBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.track_item_middle_guideline, 5);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTrackBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ItemTrackBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (androidx.constraintlayout.widget.Guideline) bindings[5]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.trackItemAlbum.setTag(null);
        this.trackItemDuration.setTag(null);
        this.trackItemImage.setTag(null);
        this.trackItemTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.track == variableId) {
            setTrack((com.sample.musicx.model.TrackEmbedded) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTrack(@Nullable com.sample.musicx.model.TrackEmbedded Track) {
        this.mTrack = Track;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.track);
        super.requestRebind();
    }
    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.sample.musicx.model.Album trackAlbum = null;
        java.lang.String trackTitle = null;
        com.sample.musicx.model.TrackEmbedded track = mTrack;
        long trackDuration = 0;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String trackAlbumTitle = null;
        java.lang.String trackAlbumImage = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (track != null) {
                    // read track.album
                    trackAlbum = track.getAlbum();
                    // read track.title
                    trackTitle = track.getTitle();
                    // read track.duration
                    trackDuration = track.getDuration();
                }


                if (trackAlbum != null) {
                    // read track.album.title
                    trackAlbumTitle = trackAlbum.getTitle();
                    // read track.album.image
                    trackAlbumImage = trackAlbum.getImage();
                }
        }
        if ((dirtyFlags & 0x6L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(clickListener);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.trackItemAlbum, trackAlbumTitle);
            com.sample.musicx.adapters.BindingAdaptersKt.bindFormatElapsedTime(this.trackItemDuration, trackDuration);
            com.sample.musicx.adapters.BindingAdaptersKt.bindImageFromUri(this.trackItemImage, trackAlbumImage);
            com.sample.musicx.adapters.BindingAdaptersKt.bindTextWithoutNewLines(this.trackItemTitle, trackTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): track
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}