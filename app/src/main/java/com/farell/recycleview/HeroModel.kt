package com.farell.recycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class HeroModel(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable