package com.farmbuddy.utils

import com.farmbuddy.R
import com.farmbuddy.models.FeaturedPost
import com.farmbuddy.models.RecommendedPost
import com.farmbuddy.models.ResourceCategory
import com.farmbuddy.models.ResourceItem

/**
 * @author Akash Yadav
 */

fun sampleFeaturedPosts(): List<FeaturedPost> {
  return mutableListOf<FeaturedPost>().apply {
    add(
      FeaturedPost(
        "",
        "Safety guide for Power Tillers", R.drawable.power_tiller,
        listOf(R.drawable.power_tiller_desc)))
    add(
      FeaturedPost(
        "",
        "Safety guide for Combine Harvestors", R.drawable.combine_harvester,
        listOf(R.drawable.combine_harvester_desc)))
    add(
      FeaturedPost(
        "",
        "Safety guide for Tractors", R.drawable.tractor, listOf(R.drawable.tractor_desc)))
  }
}

fun sampleRecommendedPosts(): List<RecommendedPost> {
  return mutableListOf<RecommendedPost>().apply {
    add(RecommendedPost("", R.drawable.mahindra, "The new Mahindra Tractor", "",
      listOf("resource", "new", "tractor")))
    add(RecommendedPost("", R.drawable.pt_rbd, "The new RBD power tiller", "",
      listOf("resource", "new", "power tiller")))
    add(RecommendedPost("", R.drawable.swaraj, "Meet the new Swaraj Tractor", "",
      listOf("resource", "new", "tractor")))
    add(RecommendedPost("", R.drawable.pt_balwaan, "The new Balwaan power tiller", "",
      listOf("resource", "new", "power tiller")))
  }
}

fun sampleResourceCategories(): List<ResourceCategory> {
  return mutableListOf<ResourceCategory>().apply {
    add(ResourceCategory(name = "New Farming Machinery", image = "", imgRes = R.drawable.tractor,
      btnIcon = R.drawable.ic_add, subCategories = sampleMachinery()))
    add(ResourceCategory(name = "Available Labor", image = "", imgRes = R.drawable.labor,
      btnIcon = R.drawable.ic_list, subCategories = sampleLabor()))
  }
}

fun sampleMachinery(): List<ResourceCategory> {
  return mutableListOf<ResourceCategory>().apply {
    add(ResourceCategory(name = "Tractors", image = "", imgRes = R.drawable.tractor,
      resources = sampleTractors(), descImages = listOf(R.drawable.tractor_desc)))
    add(ResourceCategory(name = "Fertilizer sprays", image = "",
      imgRes = R.drawable.fertilizer_spray))
    add(ResourceCategory(name = "Power Tiller", image = "", imgRes = R.drawable.power_tiller,
      resources = samplePowerTillers(),
      descImages = listOf(R.drawable.power_tiller_desc)))
    add(ResourceCategory(name = "Combine Harvester", image = "",
      imgRes = R.drawable.combine_harvester,
      descImages = listOf(R.drawable.combine_harvester_desc)))
    add(ResourceCategory(name = "Cultivator", image = "", imgRes = R.drawable.cultivator))
    add(ResourceCategory(name = "Baler", image = "", imgRes = R.drawable.baler))
    add(ResourceCategory(name = "Thresher", image = "", imgRes = R.drawable.thresher))
  }
}

fun sampleLabor(): List<ResourceCategory> {
  return mutableListOf<ResourceCategory>().apply {
    add(ResourceCategory(name = "Expertise Transportation", "", imgRes = R.drawable.transportation))
    add(ResourceCategory(name = "Expertise Sowing", "", imgRes = R.drawable.sowing))
    add(ResourceCategory(name = "Harvesting Transportation", "",
      imgRes = R.drawable.combine_harvester))
  }
}

fun sampleTractors(): List<ResourceItem> {
  return mutableListOf<ResourceItem>().apply {
    add(ResourceItem("Mahindra Tractor", "Aditya Ambre", "", 1f, 500, 14, "Lonavala, Maharashtra",
      imgRes = R.drawable.mahindra))
    add(ResourceItem("Swaraj Tractor", "Akash Yadav", "", 1f, 400, 18, "Hadapsar, Maharashtra",
      imgRes = R.drawable.swaraj))
    add(ResourceItem("Eicher Tractor", "Jayesh Patil", "", 1f, 600, 10, "Jalgaon, Maharashtra",
      imgRes = R.drawable.eicher))
    add(ResourceItem("John Deere Tractor", "Prathamesh", "", 1f, 700, 5,
      "Shivaji Nagar, Maharashtra", imgRes = R.drawable.john_deere))
    add(ResourceItem("Sonalika Tractor", "Harsh", "", 1f, 150, 5, "Akurdi, Maharashtra",
      imgRes = R.drawable.sonalika))
  }
}

fun samplePowerTillers(): List<ResourceItem> {
  return mutableListOf<ResourceItem>().apply {
    add(
      ResourceItem("Balwaan Power Tiller", "Akash Yadav", "", 1f, 400, 18, "Hadapsar, Maharashtra",
        imgRes = R.drawable.pt_balwaan))
    add(ResourceItem("RBD Power Tiller", "Aditya Ambre", "", 1f, 500, 14, "Lonavala, Maharashtra",
      imgRes = R.drawable.pt_rbd))
    add(
      ResourceItem("Neptune Power Tiller", "Jayesh Patil", "", 1f, 600, 10, "Jalgaon, Maharashtra",
        imgRes = R.drawable.pt_neptune))
  }
}