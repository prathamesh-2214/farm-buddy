package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentVerifyOtpBinding

/**
 * @author Akash Yadav
 */
class VerifyOtpFragment : BaseFragment<FragmentVerifyOtpBinding>(R.layout.fragment_verify_otp,
  FragmentVerifyOtpBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.verify.setOnClickListener {
      val isSigningUp = VerifyOtpFragmentArgs.fromBundle(requireArguments()).isSigningUp
      // isSigningUp indicates whether the user is signing up or logging in
      // perfrom further actions accordingly

      val directions = if (isSigningUp) {
        VerifyOtpFragmentDirections.actionVerifyOtpFragmentToPersonalInfoFragment()
      } else {
        VerifyOtpFragmentDirections.actionVerifyOtpFragmentToHomeActivity()
      }

      findNavController().navigate(directions)
    }
  }
}