package com.farmbuddy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.elevation.SurfaceColors

/**
 * @author Akash Yadav
 */
open class BaseActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    window?.apply {
      val surface = SurfaceColors.SURFACE_0.getColor(this@BaseActivity)
      navigationBarColor = surface
      statusBarColor = surface
    }
  }
}