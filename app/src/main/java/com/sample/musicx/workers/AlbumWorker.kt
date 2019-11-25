package com.sample.musicx.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.sample.musicx.data.AppDatabase
import com.sample.musicx.model.Album
import com.sample.musicx.model.Track
import com.sample.musicx.utilities.ALBUMS_DATA_FILENAME
import kotlinx.coroutines.coroutineScope
import timber.log.Timber

class AlbumWorker(context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = coroutineScope {
        try {
            applicationContext.assets.open(ALBUMS_DATA_FILENAME).use { inputStream ->
                JsonReader(inputStream.reader()).use { jsonReader ->
                    val type = object : TypeToken<List<Album>>() {}.type
                    val albums: List<Album> = Gson().fromJson(jsonReader, type)

                    val db = AppDatabase.getInstance(applicationContext)
                    db.albumDao().insertAll(albums)

                    Result.success()
                }
            }
        } catch (e: Exception) {
            Result.failure()
        }
    }
}
