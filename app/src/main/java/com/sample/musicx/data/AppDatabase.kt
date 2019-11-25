package com.sample.musicx.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.sample.musicx.model.*
import com.sample.musicx.utilities.DATABASE_NAME
import com.sample.musicx.workers.AlbumWorker
import com.sample.musicx.workers.ArtistWorker
import com.sample.musicx.workers.TrackWorker
import org.jetbrains.anko.runOnUiThread

@Database(
    entities = [Album::class, Artist::class, Playlist::class, Track::class, PlaylistBuilder::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun albumDao(): AlbumDao
    abstract fun artistDao(): ArtistDao
    abstract fun trackDao(): TrackDao
    abstract fun trackEmbeddedDao(): TrackEmbeddedDao
    abstract fun playlistDao(): PlaylistDao
    abstract fun playlistBuilderDao(): PlaylistBuilderDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: buildDatabase(context).also { instance = it }
        }

        // The context for the database is usually the Application context.
        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(context, AppDatabase::class.java, DATABASE_NAME)
                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {

                        OneTimeWorkRequestBuilder<ArtistWorker>().build().run {
                            WorkManager.getInstance(context).enqueue(this)
                        }

                        OneTimeWorkRequestBuilder<AlbumWorker>().build().run {
                            WorkManager.getInstance(context).enqueue(this)
                        }
                        OneTimeWorkRequestBuilder<TrackWorker>().build().run {
                            WorkManager.getInstance(context).enqueue(this)
                        }
                    }
                }).build()
        }
    }
}
