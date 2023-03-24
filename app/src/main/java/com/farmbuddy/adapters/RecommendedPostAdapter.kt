package com.farmbuddy.adapters

import android.graphics.PorterDuff
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.farmbuddy.R
import com.farmbuddy.databinding.LayoutRecommendedBinding
import com.farmbuddy.models.RecommendedPost
import com.google.android.material.chip.Chip

/**
 * @author Akash Yadav
 */
internal class RecommendedPostAdapter(val items: List<RecommendedPost>) :
  RecyclerView.Adapter<RecommendedPostAdapter.VH>() {

  internal class VH(internal val binding: LayoutRecommendedBinding) :
    RecyclerView.ViewHolder(binding.root)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    return VH(LayoutRecommendedBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: VH, position: Int) {
    val post = items[position]
    val binding = holder.binding

    binding.title.text = post.title
    binding.description.text = post.description

    try {
      Glide.with(binding.image).load(post.image).centerCrop().into(binding.image)
    } catch (e: Exception) {
      e.printStackTrace()
      binding.image.setImageResource(R.drawable.ic_failed)
      binding.image.setColorFilter(
        ContextCompat.getColor(binding.image.context, android.R.color.white),
        PorterDuff.Mode.SRC_ATOP)
    }

    post.tags.forEach {
      val chip = Chip(binding.root.context)
      chip.text = it
      binding.tags.addView(chip)
    }
  }
}