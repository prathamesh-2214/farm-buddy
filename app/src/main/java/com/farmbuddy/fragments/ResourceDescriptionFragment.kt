package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import com.farmbuddy.R
import com.farmbuddy.adapters.ResourceDescListAdapter
import com.farmbuddy.databinding.FragmentResDescBinding

/**
 * @author Akash Yadav
 */
class ResourceDescriptionFragment :
  BaseHomeFragment<FragmentResDescBinding>(R.layout.fragment_res_desc,
    FragmentResDescBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.descList.adapter = ResourceDescListAdapter(
      ResourceDescriptionFragmentArgs.fromBundle(requireArguments()).images.toList())
  }
}