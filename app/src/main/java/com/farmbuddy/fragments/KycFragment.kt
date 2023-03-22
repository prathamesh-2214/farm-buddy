package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentKycBinding

/**
 * @author Akash Yadav
 */
class KycFragment : BaseFragment(R.layout.fragment_kyc) {

  private lateinit var binding: FragmentKycBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
    return super.onCreateView(inflater, container, savedInstanceState)!!.also {
      binding = FragmentKycBinding.bind(it)
    }
  }
}