package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import com.farmbuddy.R
import com.farmbuddy.adapters.ResourceListAdapter
import com.farmbuddy.databinding.FragmentResourceListBinding
import com.farmbuddy.utils.sampleResItems

/**
 * @author Akash Yadav
 */
class ResourceListFragment :
  BaseHomeFragment<FragmentResourceListBinding>(R.layout.fragment_resource_list,
    FragmentResourceListBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.resourceList.adapter = ResourceListAdapter(sampleResItems())
  }
}