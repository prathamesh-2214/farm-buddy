package com.farmbuddy.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentBankDetailsBinding

/**
 * @author Akash Yadav
 */
class BankDetailsFragment :
  BaseSignupFragment<FragmentBankDetailsBinding>(R.layout.fragment_bank_details,
    FragmentBankDetailsBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.signup.setOnClickListener {
      // TODO : Perform signup and then navigate to home activity
      findNavController().navigate(BankDetailsFragmentDirections.actionBankDetailsToHomeActivity())
    }
  }
}