package com.sample.musicx.workers

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.google.gson.stream.JsonReader
import com.sample.musicx.data.AppDatabase
import com.sample.musicx.model.Artist
import com.sample.musicx.utilities.ARTISTS_DATA_FILENAME
import com.sample.musicx.utilities.TRACKS_DATA_FILENAME
import kotlinx.coroutines.coroutineScope

class ArtistWorker(context: Context, workerParams: WorkerParameters) :
    CoroutineWorker(context, workerParams) {

    override suspend fun doWork(): Result = coroutineScope {
        try {
            applicationContext.assets.open(ARTISTS_DATA_FILENAME).use { inputStream ->
                JsonReader(inputStream.reader()).use { jsonReader ->
                    val type = object : TypeToken<List<Artist>>() {}.type
                    val artists: List<Artist> = Gson().fromJson(jsonReader, type)

                    val db = AppDatabase.getInstance(applicationContext)
                    db.artistDao().insertAll(artists)

                    Result.success()
                }
            }
        } catch (e: Exception) {
            Result.failure()
        }
    }
}
