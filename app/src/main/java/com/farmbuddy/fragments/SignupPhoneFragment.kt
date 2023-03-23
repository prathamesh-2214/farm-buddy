package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentSignupPhoneBinding

/**
 * @author Akash Yadav
 */
class SignupPhoneFragment : BaseFragment<FragmentSignupPhoneBinding>(R.layout.fragment_signup_phone,
  FragmentSignupPhoneBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.getOtp.setOnClickListener {
      findNavController().navigate(
        SignupPhoneFragmentDirections.actionSignupPhoneFragmentToVerifyOtpFragment(true))
    }

    binding.login.setOnClickListener {
      findNavController().navigateUp()
    }
  }
}