package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentLoginBinding

/**
 * @author Akash Yadav
 */
class LoginFragment :
  BaseFragment<FragmentLoginBinding>(R.layout.fragment_login, FragmentLoginBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.login.setOnClickListener {
      findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToVerifyOtpFragment())
    }

    binding.signUp.setOnClickListener {
      findNavController().navigate(
        LoginFragmentDirections.actionLoginFragmentToSignupPhoneFragment())
    }
  }
}