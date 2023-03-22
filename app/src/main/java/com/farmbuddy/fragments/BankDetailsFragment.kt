package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentBankDetailsBinding

/**
 * @author Akash Yadav
 */
class BankDetailsFragment : BaseFragment(R.layout.fragment_bank_details) {

  private lateinit var binding: FragmentBankDetailsBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
    return super.onCreateView(inflater, container, savedInstanceState)!!.also {
      binding = FragmentBankDetailsBinding.bind(it)
    }
  }
}