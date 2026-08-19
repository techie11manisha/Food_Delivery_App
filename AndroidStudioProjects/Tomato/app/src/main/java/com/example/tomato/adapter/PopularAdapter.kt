package com.example.tomato.adapter

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tomato.R
import com.example.tomato.databinding.PopularItemBinding

class PopularAdapter(private val items:List<String>, private val image: List<Int>,
                     private val price: List<String>):
    RecyclerView.Adapter<PopularAdapter.PopularViewHOlder> ()
    {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): PopularViewHOlder {
        return PopularViewHOlder(PopularItemBinding.
        inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(
        holder: PopularViewHOlder,
        position: Int
    ) {
        val item=items[position]
        val images = image[position]
        val price = price[position]
        holder.bind(item, price, images)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class PopularViewHOlder (private val binding: PopularItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val imagesView = binding.imageView5
        fun bind(item: String, price: String, images: Int) {
            binding.FoodNamePopular.text = item
            binding.PricePopular.text = price
            imagesView.setImageResource(images)
        }


    }

}