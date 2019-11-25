package com.sample.musicx.utilities

import android.annotation.SuppressLint
import android.support.v4.media.MediaMetadataCompat
import com.google.android.material.textfield.TextInputLayout
import com.sample.musicx.model.TrackEmbedded
import java.util.concurrent.TimeUnit

fun TextInputLayout.getInputText() = editText?.text.toString()