package com.farmbuddy.fragments

import android.os.Bundle
import androidx.annotation.LayoutRes
import com.google.android.material.transition.MaterialFade

/**
 * @author Akash Yadav
 */
abstract class BaseSignupFragment(@LayoutRes content: Int) : BaseFragment(content) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    enterTransition = MaterialSharedAxis(MaterialSharedAxis.X, true)
//    exitTransition = MaterialSharedAxis(MaterialSharedAxis.X, false)
    enterTransition = MaterialFade()
    exitTransition = MaterialFade()
  }
}