package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentPersonalInfoBinding

/**
 * @author Akash Yadav
 */
class PersonalInfoFragment : BaseFragment(R.layout.fragment_personal_info) {

  private lateinit var binding: FragmentPersonalInfoBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View {
    return super.onCreateView(inflater, container, savedInstanceState)!!.also {
      binding = FragmentPersonalInfoBinding.bind(it)
    }
  }
}