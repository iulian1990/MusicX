package com.sample.musicx.model

import android.graphics.Bitmap
import android.os.Parcelable
import androidx.room.*
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "playlists")
data class Playlist(
    @PrimaryKey val id: String,
    val title: String,
    val description: String = "",
    val image: String = ""
) : Parcelable

@Entity(
    tableName = "playlist_build",
    foreignKeys = [ForeignKey(
        entity = Playlist::class,
        parentColumns = ["id"],
        childColumns = ["playlistId"],
        onDelete = ForeignKey.CASCADE
    ), ForeignKey(
        entity = Track::class,
        parentColumns = ["id"],
        childColumns = ["trackId"],
        onDelete = ForeignKey.CASCADE
    )],
    indices = [Index(value = ["trackId", "playlistId"], unique = true)]
)
data class PlaylistBuilder(
    val playlistId: String,
    val trackId: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}