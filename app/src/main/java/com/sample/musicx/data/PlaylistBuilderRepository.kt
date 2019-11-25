package com.sample.musicx.data

import android.app.Application
import com.sample.musicx.model.PlaylistBuilder
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class PlaylistBuilderRepository private constructor(private val playlistBuilderDao: PlaylistBuilderDao) {

    suspend fun insert(playlistBuilder: PlaylistBuilder) =
        withContext(IO) {
            playlistBuilderDao.insert(playlistBuilder)
        }

    companion object {

        private var instance: PlaylistBuilderRepository? = null

        fun getInstance(playlistBuilderDao: PlaylistBuilderDao) =
            instance ?: PlaylistBuilderRepository(playlistBuilderDao).also { instance = it }
    }
}