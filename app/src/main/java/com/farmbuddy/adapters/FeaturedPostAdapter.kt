package com.farmbuddy.adapters

import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farmbuddy.R
import com.farmbuddy.databinding.LayoutFeaturedPostBinding
import com.farmbuddy.models.FeaturedPost

/**
 * @author Akash Yadav
 */
internal class FeaturedPostAdapter(private val items: List<FeaturedPost>, private val onClick: (FeaturedPost) -> Unit) :
  RecyclerView.Adapter<FeaturedPostAdapter.VH>() {

  class VH(internal val binding: LayoutFeaturedPostBinding) : RecyclerView.ViewHolder(binding.root)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    return VH(LayoutFeaturedPostBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: VH, position: Int) {
    val post = items[position]
    val binding = holder.binding

    binding.title.text = post.title
    post.imgRes?.let(binding.image::setImageResource)

//    try {
//      Glide.with(binding.image).load(post.imageUrl).centerCrop().into(binding.image)
//    } catch (e: Exception) {
//      e.printStackTrace()
//      binding.image.setImageResource(R.drawable.ic_failed)
//      binding.image.setColorFilter(
//        ContextCompat.getColor(binding.image.context, android.R.color.white),
//        PorterDuff.Mode.SRC_ATOP)
//    }
  }
}