package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentProfileBinding

/**
 * @author Akash Yadav
 */
class ProfileFragment : BaseHomeFragment<FragmentProfileBinding>(R.layout.fragment_profile,
  FragmentProfileBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.newResources.setOnClickListener {
      findNavController().navigate(
        ProfileFragmentDirections.actionProfileFragmentToNewResourcesFragment())
    }

    binding.checkResources.setOnClickListener {
      findNavController().navigate(
        ProfileFragmentDirections.actionProfileFragmentToCheckResourcesFragment())
    }
  }
}