package com.sample.musicx.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.sample.musicx.R
import com.sample.musicx.model.TrackCatalog
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class ArtistSongListFragmentDirections private constructor() {
    private data class ActionArtistSongListFragmentToPlayingFragment(val trackCatalog: TrackCatalog,
            val startTrackIndex: Int = 0) : NavDirections {
        override fun getActionId(): Int = R.id.action_artistSongListFragment_to_playingFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
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
    }

    companion object {
        fun actionArtistSongListFragmentToPlayingFragment(trackCatalog: TrackCatalog,
                startTrackIndex: Int = 0): NavDirections =
                ActionArtistSongListFragmentToPlayingFragment(trackCatalog, startTrackIndex)
    }
}
