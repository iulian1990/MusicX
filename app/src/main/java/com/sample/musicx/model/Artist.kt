package com.sample.musicx.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "artists")
data class Artist(
    @PrimaryKey val id: String,
    val name: String,
    val photo: String
) : Parcelable