package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import com.google.android.material.transition.MaterialSharedAxis

/**
 * @author Akash Yadav
 */
abstract class BaseHomeFragment<T : ViewBinding>(@LayoutRes content: Int,
  bind: ((View) -> T)? = null) : FragmentWithBinding<T>(content, bind) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enterTransition = MaterialSharedAxis(MaterialSharedAxis.X, true)
    exitTransition = MaterialSharedAxis(MaterialSharedAxis.X, false)
  }
}