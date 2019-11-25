package com.sample.musicx.databinding;
import com.sample.musicx.R;
import com.sample.musicx.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemPlaylistPickerBindingImpl extends ItemPlaylistPickerBinding implements com.sample.musicx.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.image_holder, 4);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemPlaylistPickerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemPlaylistPickerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.FrameLayout) bindings[4]
            , (android.widget.TextView) bindings[3]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.playlistTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.sample.musicx.generated.callback.OnClickListener(this, 1);
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
        if (BR.handler == variableId) {
            setHandler((com.sample.musicx.handlers.PlaylistPickerHandler) variable);
        }
        else if (BR.playlist == variableId) {
            setPlaylist((com.sample.musicx.model.Playlist) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setHandler(@Nullable com.sample.musicx.handlers.PlaylistPickerHandler Handler) {
        this.mHandler = Handler;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.handler);
        super.requestRebind();
    }
    public void setPlaylist(@Nullable com.sample.musicx.model.Playlist Playlist) {
        this.mPlaylist = Playlist;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.playlist);
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
        com.sample.musicx.handlers.PlaylistPickerHandler handler = mHandler;
        java.lang.String PlaylistTitle1 = null;
        java.lang.String playlistImage = null;
        boolean stringsKtIsBlankPlaylistImage = false;
        com.sample.musicx.model.Playlist playlist = mPlaylist;
        boolean StringsKtIsBlankPlaylistImage1 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (playlist != null) {
                    // read playlist.title
                    PlaylistTitle1 = playlist.getTitle();
                    // read playlist.image
                    playlistImage = playlist.getImage();
                }


                // read StringsKt.isBlank(playlist.image)
                stringsKtIsBlankPlaylistImage = kotlin.text.StringsKt.isBlank(playlistImage);


                // read !StringsKt.isBlank(playlist.image)
                StringsKtIsBlankPlaylistImage1 = !stringsKtIsBlankPlaylistImage;
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.mboundView1, stringsKtIsBlankPlaylistImage);
            com.sample.musicx.adapters.BindingAdaptersKt.bindRoundedCornerImageFromUri(this.mboundView1, playlistImage, mboundView1.getResources().getDimension(R.dimen.radius_small));
            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.mboundView2, StringsKtIsBlankPlaylistImage1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.playlistTitle, PlaylistTitle1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // handler
        com.sample.musicx.handlers.PlaylistPickerHandler handler = mHandler;
        // handler != null
        boolean handlerJavaLangObjectNull = false;
        // playlist
        com.sample.musicx.model.Playlist playlist = mPlaylist;



        handlerJavaLangObjectNull = (handler) != (null);
        if (handlerJavaLangObjectNull) {




            handler.pick(callbackArg_0, playlist);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): handler
        flag 1 (0x2L): playlist
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}