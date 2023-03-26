package com.farmbuddy.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * @author Akash Yadav
 */
@Parcelize
data class ResourceItem(val name: String, val owner: String, val image: String, val rating: Float, val rateDay: Int,
  val availableFor: Int, val location: String) : Parcelable