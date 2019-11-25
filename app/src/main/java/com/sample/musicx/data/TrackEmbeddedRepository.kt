package com.sample.musicx.data

class TrackEmbeddedRepository private constructor(private val trackEmbeddedDao: TrackEmbeddedDao) {

    fun getTracks() = trackEmbeddedDao.getTracks()

    fun getTracksByAlbumId(albumId: String) =
        trackEmbeddedDao.getTracksByAlbumId(albumId)

    fun getTracksByArtistId(artistId: String) =
        trackEmbeddedDao.getTracksByArtistId(artistId)

    fun getTracksByPlaylistId(playlistId: String) =
        trackEmbeddedDao.getTracksByPlaylistId(playlistId)

    companion object {

        private var instance: TrackEmbeddedRepository? = null

        fun getInstance(trackEmbeddedDao: TrackEmbeddedDao) =
            instance ?: TrackEmbeddedRepository(trackEmbeddedDao).also { instance = it }
    }
}
