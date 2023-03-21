package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentLoginBinding

/**
 * @author Akash Yadav
 */
class LoginFragment : BaseFragment(R.layout.fragment_login) {

  private lateinit var binding: FragmentLoginBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
    return FragmentLoginBinding.inflate(inflater, container, false).let {
      binding = it
      it.root
    }
  }
}