package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.viewbinding.ViewBinding
import com.google.android.material.transition.MaterialFade

/**
 * @author Akash Yadav
 */
abstract class BaseSignupFragment<T : ViewBinding>(@LayoutRes content: Int,
  bind: ((View) -> T)? = null) : BaseFragment<T>(content, bind) {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enterTransition = MaterialFade()
    exitTransition = MaterialFade()
  }
}