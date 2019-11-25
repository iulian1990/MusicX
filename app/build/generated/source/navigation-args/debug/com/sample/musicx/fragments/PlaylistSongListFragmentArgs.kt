package com.sample.musicx.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.sample.musicx.model.Playlist
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

data class PlaylistSongListFragmentArgs(val playlist: Playlist) : NavArgs {
    @Suppress("CAST_NEVER_SUCCEEDS")
    fun toBundle(): Bundle {
        val result = Bundle()
        if (Parcelable::class.java.isAssignableFrom(Playlist::class.java)) {
            result.putParcelable("playlist", this.playlist as Parcelable)
        } else if (Serializable::class.java.isAssignableFrom(Playlist::class.java)) {
            result.putSerializable("playlist", this.playlist as Serializable)
        } else {
            throw UnsupportedOperationException(Playlist::class.java.name +
                    " must implement Parcelable or Serializable or must be an Enum.")
        }
        return result
    }

    companion object {
        @JvmStatic
        fun fromBundle(bundle: Bundle): PlaylistSongListFragmentArgs {
            bundle.setClassLoader(PlaylistSongListFragmentArgs::class.java.classLoader)
            val __playlist : Playlist?
            if (bundle.containsKey("playlist")) {
                if (Parcelable::class.java.isAssignableFrom(Playlist::class.java) ||
                        Serializable::class.java.isAssignableFrom(Playlist::class.java)) {
                    __playlist = bundle.get("playlist") as Playlist?
                } else {
                    throw UnsupportedOperationException(Playlist::class.java.name +
                            " must implement Parcelable or Serializable or must be an Enum.")
                }
                if (__playlist == null) {
                    throw IllegalArgumentException("Argument \"playlist\" is marked as non-null but was passed a null value.")
                }
            } else {
                throw IllegalArgumentException("Required argument \"playlist\" is missing and does not have an android:defaultValue")
            }
            return PlaylistSongListFragmentArgs(__playlist)
        }
    }
}
