package com.sample.musicx.databinding;
import com.sample.musicx.R;
import com.sample.musicx.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentPlayerBindingImpl extends FragmentPlayerBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.player_state, 13);
        sViewsWithIds.put(R.id.back_button, 14);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    private OnClickListenerImpl mPlayerUIOnUIPlayAndroidViewViewOnClickListener;
    private OnClickListenerImpl1 mPlayerUIOnUILoopingAndroidViewViewOnClickListener;
    private OnClickListenerImpl2 mPlayerUIOnUISkipToNextAndroidViewViewOnClickListener;
    private OnClickListenerImpl3 mPlayerUIOnUISkipToPreviousAndroidViewViewOnClickListener;
    private OnClickListenerImpl4 mPlayerUIOnUIPauseAndroidViewViewOnClickListener;
    private OnClickListenerImpl5 mPlayerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener;
    // Inverse Binding Event Handlers

    public FragmentPlayerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private FragmentPlayerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageButton) bindings[14]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.SeekBar) bindings[7]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.FrameLayout) bindings[13]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            );
        this.albumArt.setTag(null);
        this.elapsedTime.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.playerAddPlaylist.setTag(null);
        this.playerLooping.setTag(null);
        this.playerPause.setTag(null);
        this.playerPlay.setTag(null);
        this.playerSeekBar.setTag(null);
        this.playerSkipToNext.setTag(null);
        this.playerSkipToPrevious.setTag(null);
        this.playerSubtitle.setTag(null);
        this.playerTitle.setTag(null);
        this.totalTime.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
        if (BR.playerUI == variableId) {
            setPlayerUI((com.sample.musicx.fragments.PlayerUI) variable);
        }
        else if (BR.viewModel == variableId) {
            setViewModel((com.sample.musicx.viewmodels.PlayerViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setPlayerUI(@Nullable com.sample.musicx.fragments.PlayerUI PlayerUI) {
        this.mPlayerUI = PlayerUI;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.playerUI);
        super.requestRebind();
    }
    public void setViewModel(@Nullable com.sample.musicx.viewmodels.PlayerViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelElapsedTime((androidx.lifecycle.MutableLiveData<java.lang.Long>) object, fieldId);
            case 1 :
                return onChangeViewModelIsLooping((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelMediaMetadata((androidx.lifecycle.MutableLiveData<com.sample.musicx.viewmodels.NowPlayingMetadata>) object, fieldId);
            case 3 :
                return onChangeViewModelIsPlaying((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelElapsedTime(androidx.lifecycle.MutableLiveData<java.lang.Long> ViewModelElapsedTime, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLooping(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsLooping, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelMediaMetadata(androidx.lifecycle.MutableLiveData<com.sample.musicx.viewmodels.NowPlayingMetadata> ViewModelMediaMetadata, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsPlaying(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelIsPlaying, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        com.sample.musicx.fragments.PlayerUI playerUI = mPlayerUI;
        long viewModelMediaMetadataDuration = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingGetValue = false;
        android.view.View.OnClickListener playerUIOnUIPlayAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener playerUIOnUILoopingAndroidViewViewOnClickListener = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlaying = false;
        java.lang.Boolean viewModelIsPlayingGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Long> viewModelElapsedTime = null;
        java.lang.Long viewModelElapsedTimeGetValue = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoopingGetValue = false;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsLooping = null;
        android.view.View.OnClickListener playerUIOnUISkipToNextAndroidViewViewOnClickListener = null;
        java.lang.Boolean viewModelIsLoopingGetValue = null;
        long androidxDatabindingViewDataBindingSafeUnboxViewModelElapsedTimeGetValue = 0;
        android.view.View.OnClickListener playerUIOnUISkipToPreviousAndroidViewViewOnClickListener = null;
        androidx.lifecycle.MutableLiveData<com.sample.musicx.viewmodels.NowPlayingMetadata> viewModelMediaMetadata = null;
        com.sample.musicx.viewmodels.NowPlayingMetadata viewModelMediaMetadataGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelIsPlaying = null;
        int viewModelIsLoopingPlayerLoopingAndroidColorColorAccentPlayerLoopingAndroidColorWhite = 0;
        java.lang.String viewModelMediaMetadataAlbumArtUri = null;
        java.lang.String viewModelMediaMetadataTitle = null;
        java.lang.String viewModelMediaMetadataSubtitle = null;
        boolean ViewModelIsPlaying1 = false;
        com.sample.musicx.viewmodels.PlayerViewModel viewModel = mViewModel;
        android.view.View.OnClickListener playerUIOnUIPauseAndroidViewViewOnClickListener = null;
        android.view.View.OnClickListener playerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener = null;

        if ((dirtyFlags & 0x50L) != 0) {



                if (playerUI != null) {
                    // read playerUI::onUIPlay
                    playerUIOnUIPlayAndroidViewViewOnClickListener = (((mPlayerUIOnUIPlayAndroidViewViewOnClickListener == null) ? (mPlayerUIOnUIPlayAndroidViewViewOnClickListener = new OnClickListenerImpl()) : mPlayerUIOnUIPlayAndroidViewViewOnClickListener).setValue(playerUI));
                    // read playerUI::onUILooping
                    playerUIOnUILoopingAndroidViewViewOnClickListener = (((mPlayerUIOnUILoopingAndroidViewViewOnClickListener == null) ? (mPlayerUIOnUILoopingAndroidViewViewOnClickListener = new OnClickListenerImpl1()) : mPlayerUIOnUILoopingAndroidViewViewOnClickListener).setValue(playerUI));
                    // read playerUI::onUISkipToNext
                    playerUIOnUISkipToNextAndroidViewViewOnClickListener = (((mPlayerUIOnUISkipToNextAndroidViewViewOnClickListener == null) ? (mPlayerUIOnUISkipToNextAndroidViewViewOnClickListener = new OnClickListenerImpl2()) : mPlayerUIOnUISkipToNextAndroidViewViewOnClickListener).setValue(playerUI));
                    // read playerUI::onUISkipToPrevious
                    playerUIOnUISkipToPreviousAndroidViewViewOnClickListener = (((mPlayerUIOnUISkipToPreviousAndroidViewViewOnClickListener == null) ? (mPlayerUIOnUISkipToPreviousAndroidViewViewOnClickListener = new OnClickListenerImpl3()) : mPlayerUIOnUISkipToPreviousAndroidViewViewOnClickListener).setValue(playerUI));
                    // read playerUI::onUIPause
                    playerUIOnUIPauseAndroidViewViewOnClickListener = (((mPlayerUIOnUIPauseAndroidViewViewOnClickListener == null) ? (mPlayerUIOnUIPauseAndroidViewViewOnClickListener = new OnClickListenerImpl4()) : mPlayerUIOnUIPauseAndroidViewViewOnClickListener).setValue(playerUI));
                    // read playerUI::onUIShowPlaylistPicker
                    playerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener = (((mPlayerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener == null) ? (mPlayerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener = new OnClickListenerImpl5()) : mPlayerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener).setValue(playerUI));
                }
        }
        if ((dirtyFlags & 0x6fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.elapsedTime
                        viewModelElapsedTime = viewModel.getElapsedTime();
                    }
                    updateLiveDataRegistration(0, viewModelElapsedTime);


                    if (viewModelElapsedTime != null) {
                        // read viewModel.elapsedTime.getValue()
                        viewModelElapsedTimeGetValue = viewModelElapsedTime.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.elapsedTime.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelElapsedTimeGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelElapsedTimeGetValue);
            }
            if ((dirtyFlags & 0x62L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLooping()
                        viewModelIsLooping = viewModel.isLooping();
                    }
                    updateLiveDataRegistration(1, viewModelIsLooping);


                    if (viewModelIsLooping != null) {
                        // read viewModel.isLooping().getValue()
                        viewModelIsLoopingGetValue = viewModelIsLooping.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLooping().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoopingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoopingGetValue);
                if((dirtyFlags & 0x62L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoopingGetValue) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLooping().getValue()) ? @android:color/colorAccent : @android:color/white
                    viewModelIsLoopingPlayerLoopingAndroidColorColorAccentPlayerLoopingAndroidColorWhite = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoopingGetValue) ? (getColorFromResource(playerLooping, R.color.colorAccent)) : (getColorFromResource(playerLooping, android.R.color.white)));
            }
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.mediaMetadata
                        viewModelMediaMetadata = viewModel.getMediaMetadata();
                    }
                    updateLiveDataRegistration(2, viewModelMediaMetadata);


                    if (viewModelMediaMetadata != null) {
                        // read viewModel.mediaMetadata.getValue()
                        viewModelMediaMetadataGetValue = viewModelMediaMetadata.getValue();
                    }


                    if (viewModelMediaMetadataGetValue != null) {
                        // read viewModel.mediaMetadata.getValue().duration
                        viewModelMediaMetadataDuration = viewModelMediaMetadataGetValue.getDuration();
                        // read viewModel.mediaMetadata.getValue().albumArtUri
                        viewModelMediaMetadataAlbumArtUri = viewModelMediaMetadataGetValue.getAlbumArtUri();
                        // read viewModel.mediaMetadata.getValue().title
                        viewModelMediaMetadataTitle = viewModelMediaMetadataGetValue.getTitle();
                        // read viewModel.mediaMetadata.getValue().subtitle
                        viewModelMediaMetadataSubtitle = viewModelMediaMetadataGetValue.getSubtitle();
                    }
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isPlaying()
                        viewModelIsPlaying = viewModel.isPlaying();
                    }
                    updateLiveDataRegistration(3, viewModelIsPlaying);


                    if (viewModelIsPlaying != null) {
                        // read viewModel.isPlaying().getValue()
                        viewModelIsPlayingGetValue = viewModelIsPlaying.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlaying().getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsPlayingGetValue);


                    // read !androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlaying().getValue())
                    ViewModelIsPlaying1 = !androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingGetValue;


                    // read androidx.databinding.ViewDataBinding.safeUnbox(!androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isPlaying().getValue()))
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlaying = androidx.databinding.ViewDataBinding.safeUnbox(ViewModelIsPlaying1);
            }
        }
        // batch finished
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindRoundedCornerImageFromUri(this.albumArt, viewModelMediaMetadataAlbumArtUri, albumArt.getResources().getDimension(R.dimen.radius_normal));
            com.sample.musicx.adapters.BindingAdaptersKt.bindBlurBackground(this.mboundView0, viewModelMediaMetadataAlbumArtUri);
            com.sample.musicx.adapters.BindingAdaptersKt.bindMax(this.playerSeekBar, viewModelMediaMetadataDuration);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.playerSubtitle, viewModelMediaMetadataSubtitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.playerTitle, viewModelMediaMetadataTitle);
            com.sample.musicx.adapters.BindingAdaptersKt.bindFormatElapsedTime(this.totalTime, viewModelMediaMetadataDuration);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindFormatElapsedTime(this.elapsedTime, androidxDatabindingViewDataBindingSafeUnboxViewModelElapsedTimeGetValue);
            com.sample.musicx.adapters.BindingAdaptersKt.bindProgress(this.playerSeekBar, viewModelElapsedTimeGetValue);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            this.playerAddPlaylist.setOnClickListener(playerUIOnUIShowPlaylistPickerAndroidViewViewOnClickListener);
            this.playerLooping.setOnClickListener(playerUIOnUILoopingAndroidViewViewOnClickListener);
            this.playerPause.setOnClickListener(playerUIOnUIPauseAndroidViewViewOnClickListener);
            this.playerPlay.setOnClickListener(playerUIOnUIPlayAndroidViewViewOnClickListener);
            this.playerSkipToNext.setOnClickListener(playerUIOnUISkipToNextAndroidViewViewOnClickListener);
            this.playerSkipToPrevious.setOnClickListener(playerUIOnUISkipToPreviousAndroidViewViewOnClickListener);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 21
            if(getBuildSdkInt() >= 21) {

                this.playerLooping.setImageTintList(androidx.databinding.adapters.Converters.convertColorToColorStateList(viewModelIsLoopingPlayerLoopingAndroidColorColorAccentPlayerLoopingAndroidColorWhite));
            }
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.playerPause, androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlaying);
            com.sample.musicx.adapters.BindingAdaptersKt.bindIsGone(this.playerPlay, androidxDatabindingViewDataBindingSafeUnboxViewModelIsPlayingGetValue);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.sample.musicx.fragments.PlayerUI value;
        public OnClickListenerImpl setValue(com.sample.musicx.fragments.PlayerUI value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onUIPlay(arg0); 
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.sample.musicx.fragments.PlayerUI value;
        public OnClickListenerImpl1 setValue(com.sample.musicx.fragments.PlayerUI value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onUILooping(arg0); 
        }
    }
    public static class OnClickListenerImpl2 implements android.view.View.OnClickListener{
        private com.sample.musicx.fragments.PlayerUI value;
        public OnClickListenerImpl2 setValue(com.sample.musicx.fragments.PlayerUI value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onUISkipToNext(arg0); 
        }
    }
    public static class OnClickListenerImpl3 implements android.view.View.OnClickListener{
        private com.sample.musicx.fragments.PlayerUI value;
        public OnClickListenerImpl3 setValue(com.sample.musicx.fragments.PlayerUI value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onUISkipToPrevious(arg0); 
        }
    }
    public static class OnClickListenerImpl4 implements android.view.View.OnClickListener{
        private com.sample.musicx.fragments.PlayerUI value;
        public OnClickListenerImpl4 setValue(com.sample.musicx.fragments.PlayerUI value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onUIPause(arg0); 
        }
    }
    public static class OnClickListenerImpl5 implements android.view.View.OnClickListener{
        private com.sample.musicx.fragments.PlayerUI value;
        public OnClickListenerImpl5 setValue(com.sample.musicx.fragments.PlayerUI value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onUIShowPlaylistPicker(arg0); 
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.elapsedTime
        flag 1 (0x2L): viewModel.isLooping()
        flag 2 (0x3L): viewModel.mediaMetadata
        flag 3 (0x4L): viewModel.isPlaying()
        flag 4 (0x5L): playerUI
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLooping().getValue()) ? @android:color/colorAccent : @android:color/white
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLooping().getValue()) ? @android:color/colorAccent : @android:color/white
    flag mapping end*/
    //end
}