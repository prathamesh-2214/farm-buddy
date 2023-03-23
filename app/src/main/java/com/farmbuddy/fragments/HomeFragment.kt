package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentHomeBinding

/**
 * @author Akash Yadav
 */
class HomeFragment :
  BaseHomeFragment<FragmentHomeBinding>(R.layout.fragment_home, FragmentHomeBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
  }
}