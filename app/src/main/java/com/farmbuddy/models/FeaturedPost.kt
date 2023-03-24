package com.farmbuddy.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Akash Yadav
 */
@Parcelize
data class FeaturedPost(val imageUrl: String, val title: String) : Parcelable