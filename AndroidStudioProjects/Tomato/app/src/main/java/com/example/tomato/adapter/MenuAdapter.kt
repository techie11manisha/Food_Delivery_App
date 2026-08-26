package com.example.tomato.adapter

import android.view.LayoutInflater
import android.view.Menu
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tomato.databinding.MenuItemBinding

class MenuAdapter(private val menuItemsName: MutableList<String>,
    private val menuItemPrice : MutableList<String>, private val MenuImage: MutableList<Int>) :
    RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    inner class MenuViewHolder(private val binding: MenuItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                menuFoodName.text = menuItemsName[position]
                menuPrice.text = menuItemPrice[position]
                menuImageName.setImageResource(MenuImage[position])
            }
        }

    }

    override fun onBindViewHolder(
        holder: MenuViewHolder,
        position: Int
    ) {
        holder.bind(position)
    }

    override fun getItemCount(): Int = menuItemsName.size

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MenuViewHolder {
        val binding = MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return MenuViewHolder(binding)
    }

}