package com.sample.musicx.utilities

import android.annotation.SuppressLint
import android.widget.SeekBar

@SuppressLint("DefaultLocale")
fun String.toUnderscore() = this.replace(" ", "_").toLowerCase()