package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import com.google.android.material.transition.MaterialFadeThrough

/**
 * @author Akash Yadav
 */
open class BaseFragment<T : ViewBinding >(@LayoutRes content: Int = 0, bind: ((View) -> T)? = null) : FragmentWithBinding<T>(
  content, bind) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enterTransition = MaterialFadeThrough()
    exitTransition = MaterialFadeThrough()
  }
}