package com.farmbuddy.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.farmbuddy.R
import com.farmbuddy.databinding.LayoutResourceItemBinding
import com.farmbuddy.models.ResourceItem

/**
 * @author Akash Yadav
 */
internal class ResourceListAdapter(private val items: List<ResourceItem>, private val onClick: ((ResourceItem) -> Unit)? = null) :
  RecyclerView.Adapter<ResourceListAdapter.VH>() {

  internal class VH(internal val binding: LayoutResourceItemBinding) :
    RecyclerView.ViewHolder(binding.root)

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
    return VH(LayoutResourceItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
  }

  override fun getItemCount(): Int {
    return items.size
  }

  override fun onBindViewHolder(holder: VH, position: Int) {
    val res = items[position]
    val binding = holder.binding

    binding.name.text = res.name
    binding.owner.text = res.owner
    binding.rate.text = binding.root.context.getString(R.string.rate_day, res.rateDay)
    binding.availability.text = binding.root.context.getString(R.string.available_for_days,
      res.availableFor)
    binding.location.text = res.location

    // TODO : Load image from url
    binding.image.setImageResource(R.drawable.tractor)

    if (res.imgRes != null) {
      binding.image.setImageResource(res.imgRes)
    }

    binding.root.setOnClickListener {
      onClick?.invoke(res)
    }
  }
}