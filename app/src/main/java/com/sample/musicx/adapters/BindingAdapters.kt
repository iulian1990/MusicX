package com.sample.musicx.adapters

import android.graphics.drawable.Drawable
import android.text.format.DateUtils
import android.view.View
import android.widget.ImageView
import android.widget.SeekBar
import android.widget.TextView
import androidx.annotation.Nullable
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import jp.wasabeef.glide.transformations.BlurTransformation


@BindingAdapter("imageFromUri")
fun bindImageFromUri(view: ImageView, imageUri: String?) {
    if (!imageUri.isNullOrBlank()) {
        Glide.with(view.context)
            .load(imageUri)
            .into(view)
    }
}

@BindingAdapter("roundedImageFromUri")
fun bindRoundedImageFromUri(view: ImageView, imageUri: String?) {
    if (!imageUri.isNullOrBlank()) {
        Glide.with(view.context)
            .load(imageUri)
            .apply(RequestOptions.circleCropTransform())
            .into(view)
    }
}

@BindingAdapter("roundedCornerImageFromUri", "size")
fun bindRoundedCornerImageFromUri(view: ImageView, imageUri: String?, size: Float?) {
    if (!imageUri.isNullOrBlank()) {
        val radius = size?.toInt() ?: 0
        Glide.with(view.context)
            .load(imageUri)
            .transform(CenterCrop(), RoundedCorners(radius))
            .into(view)
    }
}

@BindingAdapter("blurBackground")
fun bindBlurBackground(view: View, imageUri: String?) {
    Glide.with(view.context)
        .load(imageUri)
        .transform(CenterCrop(), BlurTransformation())
        .into(object : CustomTarget<Drawable>() {
            override fun onResourceReady(
                resource: Drawable,
                transition: Transition<in Drawable>?
            ) {
                view.background = resource
            }

            override fun onLoadCleared(@Nullable placeholder: Drawable?) {
            }
        })
}

@BindingAdapter("formatElapsedTime")
fun bindFormatElapsedTime(view: TextView, duration: Long) {
    val elapsedTime = DateUtils.formatElapsedTime(duration)
    view.text = elapsedTime
}

@BindingAdapter("isGone")
fun bindIsGone(view: View, isGone: Boolean) {
    view.visibility = if (isGone) {
        View.GONE
    } else {
        View.VISIBLE
    }
}

@BindingAdapter("textWithoutNewLines")
fun bindTextWithoutNewLines(view: TextView, text: String?) {
    if (text != null) {
        view.text = text.replace("\n", "")
    }
}

@BindingAdapter("max")
fun bindMax(seekBar: SeekBar, max: Long?) {
    if (max != null) {
        seekBar.max = max.toInt()
    }
}

@BindingAdapter("progress")
fun bindProgress(seekBar: SeekBar, progress: Long?) {
    if (progress != null) {
        seekBar.progress = progress.toInt()
    }
}