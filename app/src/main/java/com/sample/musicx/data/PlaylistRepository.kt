package com.sample.musicx.data

import com.sample.musicx.model.Playlist
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class PlaylistRepository private constructor(private val playlistDao: PlaylistDao) {

    fun getPlaylists() = playlistDao.getPlaylists()

    suspend fun insert(playlist: Playlist) {
        withContext(IO) {
            playlistDao.insert(playlist)
        }
    }

    companion object {

        private var instance: PlaylistRepository? = null

        fun getInstance(playlistDao: PlaylistDao) =
            instance ?: PlaylistRepository(playlistDao).also { instance = it }
    }
}
