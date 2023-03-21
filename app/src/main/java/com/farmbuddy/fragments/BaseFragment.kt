package com.farmbuddy.fragments

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.google.android.material.transition.MaterialFadeThrough

/**
 * @author Akash Yadav
 */
open class BaseFragment(@LayoutRes content: Int = 0) : Fragment(content) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enterTransition = MaterialFadeThrough()
    exitTransition = MaterialFadeThrough()
//    reenterTransition = MaterialFadeThrough()
  }
}