package com.spaceexam.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class NoteDomainModel(
    val id: Int,
    val title: String,
    val description: String
): Parcelable
