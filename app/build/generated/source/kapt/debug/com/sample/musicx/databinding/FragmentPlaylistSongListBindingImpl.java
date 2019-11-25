package com.sample.musicx.databinding;
import com.sample.musicx.R;
import com.sample.musicx.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlaylistSongListBindingImpl extends FragmentPlaylistSongListBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(11);
        sIncludes.setIncludes(6, 
            new String[] {"song_list_content"},
            new int[] {7},
            new int[] {com.sample.musicx.R.layout.song_list_content});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 8);
        sViewsWithIds.put(R.id.collapsing_toolbar_layout, 9);
        sViewsWithIds.put(R.id.toolbar, 10);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView1;
    @NonNull
    private final android.widget.ImageView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView6;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentPlaylistSongListBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds));
    }
    private FragmentPlaylistSongListBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[8]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[9]
            , (com.sample.musicx.databinding.SongListContentBinding) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[10]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.ImageView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (androidx.core.widget.NestedScrollView) bindings[6];
        this.mboundView6.setTag(null);
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
        if (BR.playlist == variableId) {
            setPlaylist((com.sample.musicx.model.Playlist) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
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
        java.lang.String playlistTitle = null;
        java.lang.String playlistImage = null;
        boolean stringsKtIsBlankPlaylistImage = false;
        java.lang.String playlistDescription = null;
        com.sample.musicx.model.Playlist playlist = mPlaylist;
        boolean stringsKtIsBlankPlaylistDescription = false;
        float stringsKtIsBlankPlaylistDescriptionMboundView5AndroidDimenNoneDpMboundView5AndroidDimenMarginSmall = 0f;
        boolean StringsKtIsBlankPlaylistImage1 = false;

        if ((dirtyFlags & 0x6L) != 0) {



                if (playlist != null) {
                    // read playlist.title
                    playlistTitle = playlist.getTitle();
                    // read playlist.image
                    playlistImage = playlist.getImage();
                    // read playlist.description
                    playlistDescription = playlist.getDescription();
                }


                // read StringsKt.isBlank(playlist.image)
                stringsKtIsBlankPlaylistImage = kotlin.text.StringsKt.isBlank(playlistImage);
                // read StringsKt.isBlank(playlist.description)
                stringsKtIsBlankPlaylistDescription = kotlin.text.StringsKt.isBlank(playlistDescription);
            if((dirtyFlags & 0x6L) != 0) {
                if(stringsKtIsBlankPlaylistDescription) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read !StringsKt.isBlank(playlist.image)
                StringsKtIsBlankPlaylistImage1 = !stringsKtIsBlankPlaylistImage;
                // read StringsKt.isBlank(playlist.description) ? @android:dimen/none_dp : @android:dimen/margin_small
                stringsKtIsBlankPlaylistDescriptionMboundView5AndroidDimenNoneDpMboundView5AndroidDimenMarginSmall = ((stringsKtIsBlankPlaylistDescription) ? (mboundView5.getResources().getDimension(R.dimen.none_dp)) : (mboundView5.getResources().getDimension(R.dimen.margin_small)));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.mboundView1, stringsKtIsBlankPlaylistImage);
            com.sample.musicx.adapters.BindingAdaptersKt.bindRoundedCornerImageFromUri(this.mboundView1, playlistImage, mboundView1.getResources().getDimension(R.dimen.radius_normal));
            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.mboundView2, StringsKtIsBlankPlaylistImage1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, playlistTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, playlistDescription);
            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.mboundView4, stringsKtIsBlankPlaylistDescription);
            androidx.databinding.adapters.ViewBindingAdapter.setPaddingTop(this.mboundView5, stringsKtIsBlankPlaylistDescriptionMboundView5AndroidDimenNoneDpMboundView5AndroidDimenMarginSmall);
        }
        executeBindingsOn(songListContent);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): songListContent
        flag 1 (0x2L): playlist
        flag 2 (0x3L): null
        flag 3 (0x4L): StringsKt.isBlank(playlist.description) ? @android:dimen/none_dp : @android:dimen/margin_small
        flag 4 (0x5L): StringsKt.isBlank(playlist.description) ? @android:dimen/none_dp : @android:dimen/margin_small
    flag mapping end*/
    //end
}