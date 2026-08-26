package com.example.tomato.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tomato.databinding.CartItemBinding

class cartAdapter(private val CartItems: MutableList<String>,private val CartItemPrice:
 MutableList<String>, private var CartImage: MutableList<Int>) :
RecyclerView.Adapter<cartAdapter.CartViewHolder>(){

    private val itemQuantitites = IntArray(CartItems.size){1}
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = CartItemBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return CartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int){
        holder.bind(position)
    }

    override fun getItemCount(): Int = CartItems.size


    inner class CartViewHolder(private val binding: CartItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.apply {
                val quantity = itemQuantitites[position]
                CartfoodName.text = CartItems[position]
                CartitemPrice.text = CartItemPrice[position]
                Cartimage.setImageResource(CartImage[position])
                cartItemQuantity.text = quantity.toString()
                minus.setOnClickListener {
                    decreaseQuantity(position)
                }

                plus.setOnClickListener {
                    increaseQuantity(position)
                }

                deletebutton.setOnClickListener {
                  val itemPosition = adapterPosition
                    if(itemPosition != RecyclerView.NO_POSITION){
                        deleteItem(itemPosition)
                    }
                }
            }
        }
        private fun decreaseQuantity(position: Int){
            if(itemQuantitites[position]>1){
                itemQuantitites[position]--
                binding.cartItemQuantity.text = itemQuantitites[position].toString()
            }
        }

        private fun increaseQuantity(position: Int){
            if(itemQuantitites[position]<10) {
                itemQuantitites[position]++
                binding.cartItemQuantity.text = itemQuantitites[position].toString()
            }
        }
        private fun deleteItem(position: Int){
            CartItems.removeAt(position)
            CartImage.removeAt(position)
            CartItemPrice.removeAt(position)
            notifyItemRemoved(position)
            notifyItemRangeChanged(position, CartItems.size)
        }
    }


}