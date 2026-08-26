package com.example.tomato

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tomato.adapter.MenuAdapter
import com.example.tomato.adapter.cartAdapter
import com.example.tomato.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottomSheetFragment : BottomSheetDialogFragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var binding = FragmentMenuBottomSheetBinding.inflate(inflater, container, false)

        binding.buttonBack.setOnClickListener {
            dismiss()
        }
        val menuFoodName = listOf("Burger", "Sandwich", "Momos", "item", "sandwich", "Momos")
        val menuItemPrice = listOf("$5", "$6", "$8", "$9", "$10", "$10")
        val menuImage = listOf(
            R.drawable.menu_photo1,
            R.drawable.menu_photo2,
            R.drawable.menu_photo3,
            R.drawable.menu_photo4,
            R.drawable.menu_photo1,
            R.drawable.menu_photo2
        )
        val adapter = MenuAdapter(
            ArrayList(menuFoodName), ArrayList(menuItemPrice),
            ArrayList(menuImage)
        )
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter
        return binding.root
    }
    companion object {

    }
}