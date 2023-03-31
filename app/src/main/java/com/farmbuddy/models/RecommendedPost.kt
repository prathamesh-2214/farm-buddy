package com.farmbuddy.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Akash Yadav
 */
@Parcelize
data class RecommendedPost(val image: String, val imgRes: Int? = null, val title: String, val description: String,
  val tags: List<String>) : Parcelable