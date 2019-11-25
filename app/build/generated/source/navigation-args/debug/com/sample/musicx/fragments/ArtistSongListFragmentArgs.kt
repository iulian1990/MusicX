package com.sample.musicx.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sample.musicx.model.Artist
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class ArtistSongListFragmentArgs(val artist: Artist) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Artist::class.java)) {
            result.putParcelable("artist", this.artist as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Artist::class.java)) {
            result.putSerializable("artist", this.artist as Serializable)
        } else {
            throw UnsupportedOperationException(Artist::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): ArtistSongListFragmentArgs {
            bundle.setClassLoader(ArtistSongListFragmentArgs::class.java.classLoader)
            val __artist : Artist?
            if (bundle.containsKey("artist")) {
                if (Parcelable::class.java.isAssignableFrom(Artist::class.java) ||
                        Serializable::class.java.isAssignableFrom(Artist::class.java)) {
                    __artist = bundle.get("artist") as Artist?
                } else {
                    throw UnsupportedOperationException(Artist::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__artist == null) {
                    throw IllegalArgumentException("Argument \"artist\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"artist\" is missing and does not have an android:defaultValue")
            }
            return ArtistSongListFragmentArgs(__artist)
        }
    }
}
