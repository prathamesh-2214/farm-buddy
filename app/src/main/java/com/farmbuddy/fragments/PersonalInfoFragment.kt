package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentPersonalInfoBinding

/**
 * @author Akash Yadav
 */
class PersonalInfoFragment :
  BaseSignupFragment<FragmentPersonalInfoBinding>(R.layout.fragment_personal_info,
    FragmentPersonalInfoBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.next.setOnClickListener {
      findNavController().navigate(
        PersonalInfoFragmentDirections.actionPersonalInfoFragmentToBankDetailsFragment())
    }
  }
}