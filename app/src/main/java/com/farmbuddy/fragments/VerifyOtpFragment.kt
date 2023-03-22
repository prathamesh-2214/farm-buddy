package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentVerifyOtpBinding

/**
 * @author Akash Yadav
 */
class VerifyOtpFragment : BaseFragment(R.layout.fragment_verify_otp) {

  private lateinit var binding: FragmentVerifyOtpBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View {
    return FragmentVerifyOtpBinding.inflate(inflater, container, false).let {
      binding = it
      it.root
    }
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.verify.setOnClickListener {
      val isSigningUp = VerifyOtpFragmentArgs.fromBundle(requireArguments()).isSigningUp
      if (isSigningUp) {
        findNavController().navigate(
          VerifyOtpFragmentDirections.actionVerifyOtpFragmentToPersonalInfoFragment())
      }
    }
  }
}