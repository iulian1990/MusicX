package com.sample.musicx.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(
    tableName = "tracks",
    foreignKeys = [ForeignKey(
        entity = Album::class,
        parentColumns = ["id"],
        childColumns = ["albumId"],
        onDelete = ForeignKey.CASCADE
    ), ForeignKey(
        entity = Artist::class,
        parentColumns = ["id"],
        childColumns = ["artistId"],
        onDelete = ForeignKey.CASCADE
    )]
)
data class Track(
    @PrimaryKey val id: String,
    val title: String,
    @SerializedName("album_id") val albumId: String,
    @SerializedName("artist_id") val artistId: String,
    val source: String,
    val duration: Long
)