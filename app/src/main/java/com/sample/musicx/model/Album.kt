package com.sample.musicx.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "albums")
data class Album(
    @PrimaryKey val id: String,
    val title: String,
    val image: String
) : Parcelable