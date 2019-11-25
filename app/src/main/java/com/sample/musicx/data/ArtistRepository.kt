package com.sample.musicx.data

import com.sample.musicx.model.Artist
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext

class ArtistRepository private constructor(private val artistDao: ArtistDao) {

    fun getArtists() = artistDao.getArtists()

    suspend fun insertAll(artists: List<Artist>) {
        withContext(IO) {
            artistDao.insertAll(artists)
        }
    }

    companion object {

        private var instance: ArtistRepository? = null

        fun getInstance(artistDao: ArtistDao) =
            instance ?: ArtistRepository(artistDao).also { instance = it }
    }
}
