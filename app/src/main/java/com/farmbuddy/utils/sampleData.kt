package com.farmbuddy.utils

import com.farmbuddy.models.FeaturedPost
import com.farmbuddy.models.RecommendedPost

/**
 * @author Akash Yadav
 */

fun sampleFeaturedPosts(): List<FeaturedPost> {
  return mutableListOf<FeaturedPost>().apply {
    add(
      FeaturedPost(
        "https://images.unsplash.com/photo-1587387119725-9d6bac0f22fb?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8NXx8aG9yaXpvbnRhbHxlbnwwfHwwfHw%3D&w=1000&q=80",
        "First post"))
    add(
      FeaturedPost(
        "https://images.unsplash.com/photo-1568724183504-f3d7975131b1?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxjb2xsZWN0aW9uLXRodW1ibmFpbHx8Nzc2NTYxMTl8fGVufDB8fHx8&auto=format&fit=crop&w=420&q=60",
        "Second post"))
    add(
      FeaturedPost(
        "https://images.unsplash.com/photo-1520017357217-59228ba0935f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwcm9maWxlLXBhZ2V8Nnx8fGVufDB8fHx8&w=1000&q=80",
        "Third post"))
  }
}

fun sampleRecommendedPosts() : List<RecommendedPost> {
  return mutableListOf<RecommendedPost>().apply {
    add(RecommendedPost("", "Title 1", "Desription 1", listOf("tag1", "tag2", "tag3")))
    add(RecommendedPost("", "Title 2", "Desription 2", listOf("tag1", "tag2", "tag3")))
    add(RecommendedPost("", "Title 3", "Desription 3", listOf("tag1", "tag2", "tag3")))
    add(RecommendedPost("", "Title 4", "Desription 4", listOf("tag1", "tag2", "tag3")))
  }
}