package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import com.farmbuddy.R
import com.farmbuddy.adapters.ResourceCategoryAdapter
import com.farmbuddy.databinding.FragmentNewResourcesBinding
import com.farmbuddy.utils.sampleResourceCategories

/**
 * @author Akash Yadav
 */
class NewResourcesFragment :
  BaseHomeFragment<FragmentNewResourcesBinding>(R.layout.fragment_new_resources,
    FragmentNewResourcesBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.resourceCategories.adapter = ResourceCategoryAdapter(sampleResourceCategories())
  }
}