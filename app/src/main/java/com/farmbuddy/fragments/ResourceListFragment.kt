package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.farmbuddy.R
import com.farmbuddy.adapters.ResourceListAdapter
import com.farmbuddy.databinding.FragmentResourceListBinding

/**
 * @author Akash Yadav
 */
class ResourceListFragment :
  BaseHomeFragment<FragmentResourceListBinding>(R.layout.fragment_resource_list,
    FragmentResourceListBinding::bind) {

  private lateinit var args: ResourceListFragmentArgs

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    args = ResourceListFragmentArgs.fromBundle(requireArguments())

    binding.resourceList.adapter = ResourceListAdapter(
      args.resources.asList()) {
      if (args.category.descImages.isNotEmpty()) {
        findNavController().navigate(
          ResourceListFragmentDirections.actionResourceListFragmentToResourceDescriptionFragment(
            args.category.descImages.toIntArray()))
      }
    }
  }
}