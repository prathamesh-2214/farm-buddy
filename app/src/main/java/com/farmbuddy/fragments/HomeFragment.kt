package com.farmbuddy.fragments

import android.os.Bundle
import android.view.View
import com.farmbuddy.R
import com.farmbuddy.adapters.FeaturedPostAdapter
import com.farmbuddy.adapters.RecommendedPostAdapter
import com.farmbuddy.databinding.FragmentHomeBinding
import com.farmbuddy.utils.sampleFeaturedPosts
import com.farmbuddy.utils.sampleRecommendedPosts

/**
 * @author Akash Yadav
 */
class HomeFragment :
  BaseHomeFragment<FragmentHomeBinding>(R.layout.fragment_home, FragmentHomeBinding::bind) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.featuredList.adapter = FeaturedPostAdapter(sampleFeaturedPosts()) {

    }
    binding.recommendedList.adapter = RecommendedPostAdapter(sampleRecommendedPosts())
  }
}