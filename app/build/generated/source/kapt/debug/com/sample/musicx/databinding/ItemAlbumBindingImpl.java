package com.sample.musicx.databinding;
import com.sample.musicx.R;
import com.sample.musicx.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemAlbumBindingImpl extends ItemAlbumBinding implements com.sample.musicx.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemAlbumBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private ItemAlbumBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.albumItemImage.setTag(null);
        this.albumItemTitle.setTag(null);
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.sample.musicx.generated.callback.OnClickListener(this, 1);
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
        if (BR.album == variableId) {
            setAlbum((com.sample.musicx.model.Album) variable);
        }
        else if (BR.handler == variableId) {
            setHandler((com.sample.musicx.handlers.AlbumHandler) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAlbum(@Nullable com.sample.musicx.model.Album Album) {
        this.mAlbum = Album;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.album);
        super.requestRebind();
    }
    public void setHandler(@Nullable com.sample.musicx.handlers.AlbumHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.handler);
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
        com.sample.musicx.model.Album album = mAlbum;
        com.sample.musicx.handlers.AlbumHandler handler = mHandler;
        java.lang.String albumTitle = null;
        java.lang.String albumImage = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (album != null) {
                    // read album.title
                    albumTitle = album.getTitle();
                    // read album.image
                    albumImage = album.getImage();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindImageFromUri(this.albumItemImage, albumImage);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.albumItemTitle, albumTitle);
        }
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // album
        com.sample.musicx.model.Album album = mAlbum;
        // handler
        com.sample.musicx.handlers.AlbumHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.showSongs(callbackArg_0, album);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): album
        flag 1 (0x2L): handler
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}