package com.farmbuddy.models

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

/**
 * @author Akash Yadav
 */
@Parcelize
data class ResourceCategory(val name: String, val image: String,
  @DrawableRes val imgRes: Int? = null, @DrawableRes val btnIcon: Int? = null) : Parcelable