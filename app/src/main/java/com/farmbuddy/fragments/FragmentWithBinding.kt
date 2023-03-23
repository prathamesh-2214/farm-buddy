package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

/**
 * @author Akash Yadav
 */
abstract class FragmentWithBinding<T : ViewBinding>(@LayoutRes content: Int = 0,
  private val bind: ((View) -> T)? = null) : Fragment(content) {

  protected lateinit var binding: T

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
    return super.onCreateView(inflater, container, savedInstanceState).also { inflated ->
      inflated?.let { view ->
        bind?.invoke(view)?.let { bound ->
          binding = bound
        }
      }
    }
  }
}