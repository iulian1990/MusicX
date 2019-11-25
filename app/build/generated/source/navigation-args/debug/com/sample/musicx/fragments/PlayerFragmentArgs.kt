package com.sample.musicx.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sample.musicx.model.TrackCatalog
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class PlayerFragmentArgs(val trackCatalog: TrackCatalog, val startTrackIndex: Int = 0) :
        NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(TrackCatalog::class.java)) {
            result.putParcelable("trackCatalog", this.trackCatalog as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(TrackCatalog::class.java)) {
            result.putSerializable("trackCatalog", this.trackCatalog as Serializable)
        } else {
            throw UnsupportedOperationException(TrackCatalog::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        result.putInt("startTrackIndex", this.startTrackIndex)
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): PlayerFragmentArgs {
            bundle.setClassLoader(PlayerFragmentArgs::class.java.classLoader)
            val __trackCatalog : TrackCatalog?
            if (bundle.containsKey("trackCatalog")) {
                if (Parcelable::class.java.isAssignableFrom(TrackCatalog::class.java) ||
                        Serializable::class.java.isAssignableFrom(TrackCatalog::class.java)) {
                    __trackCatalog = bundle.get("trackCatalog") as TrackCatalog?
                } else {
                    throw UnsupportedOperationException(TrackCatalog::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__trackCatalog == null) {
                    throw IllegalArgumentException("Argument \"trackCatalog\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"trackCatalog\" is missing and does not have an android:defaultValue")
            }
            val __startTrackIndex : Int
            if (bundle.containsKey("startTrackIndex")) {
                __startTrackIndex = bundle.getInt("startTrackIndex")
            } else {
                __startTrackIndex = 0
            }
            return PlayerFragmentArgs(__trackCatalog, __startTrackIndex)
        }
    }
}
