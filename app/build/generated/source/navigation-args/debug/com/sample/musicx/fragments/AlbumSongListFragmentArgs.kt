package com.sample.musicx.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sample.musicx.model.Album
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class AlbumSongListFragmentArgs(val album: Album) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Album::class.java)) {
            result.putParcelable("album", this.album as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Album::class.java)) {
            result.putSerializable("album", this.album as Serializable)
        } else {
            throw UnsupportedOperationException(Album::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): AlbumSongListFragmentArgs {
            bundle.setClassLoader(AlbumSongListFragmentArgs::class.java.classLoader)
            val __album : Album?
            if (bundle.containsKey("album")) {
                if (Parcelable::class.java.isAssignableFrom(Album::class.java) ||
                        Serializable::class.java.isAssignableFrom(Album::class.java)) {
                    __album = bundle.get("album") as Album?
                } else {
                    throw UnsupportedOperationException(Album::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__album == null) {
                    throw IllegalArgumentException("Argument \"album\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"album\" is missing and does not have an android:defaultValue")
            }
            return AlbumSongListFragmentArgs(__album)
        }
    }
}
