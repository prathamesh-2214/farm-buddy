package com.farmbuddy.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.farmbuddy.databinding.LayoutNewResourceCategoryBinding
import com.farmbuddy.fragments.NewResourcesFragmentDirections
import com.farmbuddy.models.ResourceCategory

/**
 * @author Akash Yadav
 */
internal class ResourceCategoryAdapter(private val items: List<ResourceCategory>, private val onClick: ((ResourceCategory) -> Unit)? = null) :
  RecyclerView.Adapter<ResourceCategoryAdapter.VH>() {

  internal class VH(internal val binding: LayoutNewResourceCategoryBinding) :
    RecyclerView.ViewHolder(binding.root)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    return VH(
      LayoutNewResourceCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: VH, position: Int) {
    val category = items[position]
    val binding = holder.binding

    binding.title.text = category.name

    // TODO : Set image from URL
    binding.image.setImageResource(category.imgRes!!)

    category.btnIcon?.let {
      binding.title.setIconResource(category.btnIcon)
    }

    binding.root.setOnClickListener {
      onClick?.invoke(category)
    }
  }
}