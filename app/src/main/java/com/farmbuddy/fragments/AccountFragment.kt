package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.NavHostFragment
import com.farmbuddy.R
import com.farmbuddy.databinding.FragmentAccountBinding
import com.farmbuddy.utils.resolveAttr
import com.farmbuddy.viewmodel.HomeViewModel

/**
 * @author Akash Yadav
 */
class AccountFragment : BaseHomeFragment<FragmentAccountBinding>(R.layout.fragment_account,
  FragmentAccountBinding::bind) {

  private val viewModel by viewModels<HomeViewModel>(ownerProducer = { requireActivity() })

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.fragmentContainer.getFragment<NavHostFragment>().navController.addOnDestinationChangedListener { _, destination, _ ->
      viewModel.statusBarColor = if (destination.id == R.id.profileFragment) {
        requireContext().resolveAttr(com.google.android.material.R.attr.colorPrimaryContainer)
      } else requireContext().resolveAttr(com.google.android.material.R.attr.colorSurface)
    }
  }
}