package com.sample.musicx.utilities

import android.app.Application
import android.content.Context
import com.sample.musicx.data.*
import com.sample.musicx.model.TrackCatalog
import com.sample.musicx.viewmodels.*

object InjectorUtils {
    private fun getTrackEmbeddedRepository(context: Context): TrackEmbeddedRepository {
        val dao = AppDatabase.getInstance(context.applicationContext).trackEmbeddedDao()
        return TrackEmbeddedRepository.getInstance(dao)
    }

    private fun getAlbumRepository(context: Context): AlbumRepository {
        val dao = AppDatabase.getInstance(context.applicationContext).albumDao()
        return AlbumRepository.getInstance(dao)
    }

    private fun getArtistRepository(context: Context): ArtistRepository {
        val dao = AppDatabase.getInstance(context.applicationContext).artistDao()
        return ArtistRepository.getInstance(dao)
    }

    private fun getPlaylistRepository(context: Context): PlaylistRepository {
        val dao = AppDatabase.getInstance(context.applicationContext).playlistDao()
        return PlaylistRepository.getInstance(dao)
    }

    private fun getPlaylistBuilderRepository(context: Context): PlaylistBuilderRepository {
        val dao = AppDatabase.getInstance(context.applicationContext).playlistBuilderDao()
        return PlaylistBuilderRepository.getInstance(dao)
    }

    fun providePlaylistPickerViewModelFactory(
        application: Application,
        trackId: String
    ): PlaylistPickerViewModelFactory {

        val playlistRepository = getPlaylistRepository(application)
        val playlistBuilderRepository = getPlaylistBuilderRepository(application)

        return PlaylistPickerViewModelFactory(
            application,
            trackId,
            playlistRepository,
            playlistBuilderRepository
        )
    }

    fun provideAlbumViewModelFactory(context: Context): AlbumViewModelFactory {
        val repository = getAlbumRepository(context)
        return AlbumViewModelFactory(repository)
    }

    fun provideArtistViewModelFactory(context: Context): ArtistViewModelFactory {
        val repository = getArtistRepository(context)
        return ArtistViewModelFactory(repository)
    }

    fun providePlaylistViewModelFactory(context: Context): PlaylistViewModelFactory {
        val repository = getPlaylistRepository(context)
        return PlaylistViewModelFactory(repository)
    }

    fun provideSongListViewModelFactory(
        context: Context,
        type: SongListType,
        id: String = ""
    ): SongListViewModelFactory {
        val repository = getTrackEmbeddedRepository(context)
        return SongListViewModelFactory(repository, type, id)
    }

    fun providePlayerViewModelFactory(
        catalog: TrackCatalog,
        startTrackIndex: Int
    ): PlayerViewModelFactory {
        return PlayerViewModelFactory(catalog, startTrackIndex)
    }
}