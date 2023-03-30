package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.transition.TransitionManager
import com.farmbuddy.R
import com.farmbuddy.adapters.ResourceCategoryAdapter
import com.farmbuddy.databinding.FragmentNewResourcesBinding
import com.farmbuddy.utils.sampleResourceCategories
import com.google.android.material.transition.MaterialFade

/**
 * @author Akash Yadav
 */
class NewResourcesFragment :
  BaseHomeFragment<FragmentNewResourcesBinding>(R.layout.fragment_new_resources,
    FragmentNewResourcesBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.resourceCategories.adapter = ResourceCategoryAdapter(sampleResourceCategories()) {
      if (it.subCategories.isNotEmpty()) {
        TransitionManager.beginDelayedTransition(binding.root, MaterialFade())
        binding.resourceCategories.adapter = ResourceCategoryAdapter(it.subCategories) { category ->
          if (category.resources.isNotEmpty()) {
            findNavController().navigate(
              NewResourcesFragmentDirections.actionNewResourcesFragmentToResourceListFragment(
                category.resources.toTypedArray()))
          }
        }
      } else if (it.resources.isNotEmpty()) {
        findNavController().navigate(
          NewResourcesFragmentDirections.actionNewResourcesFragmentToResourceListFragment(
            it.resources.toTypedArray()))
      }
    }
  }
}