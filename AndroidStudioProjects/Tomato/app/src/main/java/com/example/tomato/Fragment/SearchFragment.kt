package com.example.tomato.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tomato.R
import com.example.tomato.adapter.MenuAdapter
import com.example.tomato.databinding.FragmentSearchBinding


class SearchFragment : Fragment() {
    private lateinit var binding: FragmentSearchBinding
    private lateinit var adapter: MenuAdapter

    private val originalMenuFoodName =  listOf("Burger", "Sandwich", "Momos", "item", "sandwich", "Momos")
    private val originalMenuItemPrice = listOf("$5", "$6", "$8", "$9", "$10", "$10")
    private val originalMenuImage = listOf(
        R.drawable.menu_photo1,
        R.drawable.menu_photo2,
        R.drawable.menu_photo3,
        R.drawable.menu_photo4,
        R.drawable.menu_photo1,
        R.drawable.menu_photo2
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    private val filteredMenuFoodName = mutableListOf<String>()
    private val filteredMenuItemPrice = mutableListOf<String>()
    private val filteredMenuImage = mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        adapter = MenuAdapter(filteredMenuFoodName, filteredMenuItemPrice,
            filteredMenuImage)
        binding.menuRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter = adapter

        //setup for search view
        setupSearchView()

        showAllMenu()
        return binding.root
    }

    private fun showAllMenu() {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()

        filteredMenuFoodName.addAll(originalMenuFoodName)
        filteredMenuItemPrice.addAll(originalMenuItemPrice)
        filteredMenuImage.addAll(originalMenuImage)

        adapter.notifyDataSetChanged()
    }

    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                filterMenuItems(newText)
                return true
            }
        })
    }

    private fun filterMenuItems(query: String?) {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()

        originalMenuFoodName.forEachIndexed {  index, foodName ->
            if(foodName.contains(query.toString(), ignoreCase =  true) ){
                filteredMenuFoodName.add(foodName)
                filteredMenuItemPrice.add(originalMenuItemPrice[index])
                filteredMenuImage.add(originalMenuImage[index])
            }
        }
        adapter.notifyDataSetChanged()
    }

    companion object {

    }
}