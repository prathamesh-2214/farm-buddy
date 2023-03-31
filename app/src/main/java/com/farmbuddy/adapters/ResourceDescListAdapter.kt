package com.farmbuddy.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farmbuddy.databinding.LayoutResDescItemBinding

/**
 * @author Akash Yadav
 */
class ResourceDescListAdapter(private val items: List<Int>) :
  RecyclerView.Adapter<ResourceDescListAdapter.VH>() {

  inner class VH(val binding: LayoutResDescItemBinding) : RecyclerView.ViewHolder(binding.root)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    return VH(LayoutResDescItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: VH, position: Int) {
    holder.binding.image.setImageResource(items[position])
  }
}