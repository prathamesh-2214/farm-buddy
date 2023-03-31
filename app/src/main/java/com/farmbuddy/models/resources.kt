package com.farmbuddy.models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

/**
 * @author Akash Yadav
 */
@Parcelize
open class ResourceCategory(val name: String, val image: String,
  @DrawableRes val imgRes: Int? = null, @DrawableRes val btnIcon: Int? = null,
  val subCategories: List<ResourceCategory> = emptyList(),
  val resources: List<ResourceItem> = emptyList(),
  val descImages: List<Int> = emptyList()) : Parcelable

/**
 * @author Akash Yadav
 */
@Parcelize
data class ResourceItem(val name: String, val owner: String, val image: String, val rating: Float,
  val rateDay: Int,
  val availableFor: Int, val location: String, @DrawableRes val imgRes: Int? = null) : Parcelable