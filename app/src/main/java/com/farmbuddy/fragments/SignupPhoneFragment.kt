package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentSignupPhoneBinding

/**
 * @author Akash Yadav
 */
class SignupPhoneFragment : BaseFragment(R.layout.fragment_signup_phone) {

  private lateinit var binding: FragmentSignupPhoneBinding

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
    savedInstanceState: Bundle?): View? {
    return FragmentSignupPhoneBinding.inflate(inflater, container, false).let {
      binding = it
      it.root
    }
  }

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