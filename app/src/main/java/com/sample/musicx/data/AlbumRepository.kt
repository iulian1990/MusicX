package com.sample.musicx.data

import com.sample.musicx.model.Album
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class AlbumRepository private constructor(private val albumDao: AlbumDao) {

    fun getAlbums() = albumDao.getAlbums()

    suspend fun insertAll(albums: List<Album>) {
        withContext(IO) {
            albumDao.insertAll(albums)
        }
    }

    companion object {

        private var instance: AlbumRepository? = null

        fun getInstance(albumDao: AlbumDao) =
            instance ?: AlbumRepository(albumDao).also { instance = it }
    }
}