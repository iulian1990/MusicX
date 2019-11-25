package com.sample.musicx.model

import android.os.Parcelable
import androidx.room.Embedded
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrackEmbedded(
    @PrimaryKey val id: String,
    val title: String,
    @Embedded(prefix = "album_")
    val album: Album,
    @Embedded(prefix = "artist_")
    val artist: Artist,
    val source: String,
    val duration: Long
) : Parcelable

@Parcelize
class TrackCatalog(val tracks: List<TrackEmbedded> = listOf()) : Parcelable