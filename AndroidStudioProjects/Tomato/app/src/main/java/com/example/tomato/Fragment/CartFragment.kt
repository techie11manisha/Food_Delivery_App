package com.example.tomato.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tomato.R
import com.example.tomato.adapter.cartAdapter
import com.example.tomato.databinding.FragmentCartBinding

class CartFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(inflater, container, false)

        val cartFoodName = listOf("Burger", "Sandwich", "Momos", "item", "sandwich", "Momos")
        val cartItemPrice = listOf("$5", "$6", "$8", "$9", "$10", "$10")
        val cartImage = listOf(
            R.drawable.menu_photo1,
            R.drawable.menu_photo2,
            R.drawable.menu_photo3,
            R.drawable.menu_photo4,
            R.drawable.menu_photo1,
            R.drawable.menu_photo2
        )
        val adapter = cartAdapter(ArrayList(cartFoodName), ArrayList(cartItemPrice),
            ArrayList(cartImage))
        binding.cartRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.cartRecyclerView.adapter = adapter
        return binding.root
    }

    companion object {

    }
}