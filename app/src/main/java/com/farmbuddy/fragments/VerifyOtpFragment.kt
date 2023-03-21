package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farmbuddy.databinding.FragmentVerifyOtpBinding

/**
 * @author Akash Yadav
 */
class VerifyOtpFragment : BaseFragment() {

  private lateinit var binding: FragmentVerifyOtpBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View {
    return FragmentVerifyOtpBinding.inflate(inflater, container, false).let {
      binding = it
      it.root
    }
  }
}