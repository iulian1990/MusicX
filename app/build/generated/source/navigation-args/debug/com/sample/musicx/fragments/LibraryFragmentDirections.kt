package com.sample.musicx.fragments

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.sample.musicx.R
import com.sample.musicx.model.Album
import com.sample.musicx.model.Artist
import com.sample.musicx.model.Playlist
import com.sample.musicx.model.TrackCatalog
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

class LibraryFragmentDirections private constructor() {
    private data class ActionLibraryFragmentToAlbumSongListFragment(val album: Album) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_libraryFragment_to_albumSongListFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
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
    }

    private data class ActionLibraryFragmentToPlaylistSongListFragment(val playlist: Playlist) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_libraryFragment_to_playlistSongListFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
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
    }

    private data class ActionLibraryFragmentToArtistSongListFragment(val artist: Artist) :
            NavDirections {
        override fun getActionId(): Int = R.id.action_libraryFragment_to_artistSongListFragment

        @Suppress("CAST_NEVER_SUCCEEDS")
        override fun getArguments(): Bundle {
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
    }

    private data class ActionLibraryFragmentToPlayerFragment(val trackCatalog: TrackCatalog,
            val startTrackIndex: Int = 0) : NavDirections {
        override fun getActionId(): Int = R.id.action_libraryFragment_to_playerFragment

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
        fun actionLibraryFragmentToAlbumSongListFragment(album: Album): NavDirections =
                ActionLibraryFragmentToAlbumSongListFragment(album)

        fun actionLibraryFragmentToNewPlaylistFragment(): NavDirections =
                ActionOnlyNavDirections(R.id.action_libraryFragment_to_newPlaylistFragment)

        fun actionLibraryFragmentToPlaylistSongListFragment(playlist: Playlist): NavDirections =
                ActionLibraryFragmentToPlaylistSongListFragment(playlist)

        fun actionLibraryFragmentToArtistSongListFragment(artist: Artist): NavDirections =
                ActionLibraryFragmentToArtistSongListFragment(artist)

        fun actionLibraryFragmentToPlayerFragment(trackCatalog: TrackCatalog, startTrackIndex: Int =
                0): NavDirections = ActionLibraryFragmentToPlayerFragment(trackCatalog,
                startTrackIndex)
    }
}
