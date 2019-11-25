package com.sample.musicx.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u001a\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0007\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0002\u0010\u0013\u001a\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0007\u00a2\u0006\u0002\u0010\u0013\u001a)\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007\u00a2\u0006\u0002\u0010\u0019\u001a\u001a\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u0007\u00a8\u0006\u001d"}, d2 = {"bindBlurBackground", "", "view", "Landroid/view/View;", "imageUri", "", "bindFormatElapsedTime", "Landroid/widget/TextView;", "duration", "", "bindImageFromUri", "Landroid/widget/ImageView;", "bindIsGone", "isGone", "", "bindMax", "seekBar", "Landroid/widget/SeekBar;", "max", "(Landroid/widget/SeekBar;Ljava/lang/Long;)V", "bindProgress", "progress", "bindRoundedCornerImageFromUri", "size", "", "(Landroid/widget/ImageView;Ljava/lang/String;Ljava/lang/Float;)V", "bindRoundedImageFromUri", "bindTextWithoutNewLines", "text", "app_debug"})
public final class BindingAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"imageFromUri"})
    public static final void bindImageFromUri(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"roundedImageFromUri"})
    public static final void bindRoundedImageFromUri(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"roundedCornerImageFromUri", "size"})
    public static final void bindRoundedCornerImageFromUri(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUri, @org.jetbrains.annotations.Nullable()
    java.lang.Float size) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"blurBackground"})
    public static final void bindBlurBackground(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUri) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"formatElapsedTime"})
    public static final void bindFormatElapsedTime(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, long duration) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"isGone"})
    public static final void bindIsGone(@org.jetbrains.annotations.NotNull()
    android.view.View view, boolean isGone) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"textWithoutNewLines"})
    public static final void bindTextWithoutNewLines(@org.jetbrains.annotations.NotNull()
    android.widget.TextView view, @org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"max"})
    public static final void bindMax(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar seekBar, @org.jetbrains.annotations.Nullable()
    java.lang.Long max) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"progress"})
    public static final void bindProgress(@org.jetbrains.annotations.NotNull()
    android.widget.SeekBar seekBar, @org.jetbrains.annotations.Nullable()
    java.lang.Long progress) {
    }
}