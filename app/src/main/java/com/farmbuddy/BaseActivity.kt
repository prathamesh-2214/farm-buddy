package com.farmbuddy

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.farmbuddy.utils.resolveAttr

/**
 * @author Akash Yadav
 */
open class BaseActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    window?.apply {
      navigationBarColor = resolveAttr(com.google.android.material.R.attr.colorSurface)
      statusBarColor = resolveAttr(com.google.android.material.R.attr.colorSurface)
    }
  }
}