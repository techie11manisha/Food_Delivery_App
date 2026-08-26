package com.example.tomato.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.tomato.MenuBottomSheetFragment
import com.example.tomato.R
import com.example.tomato.adapter.PopularAdapter
import com.example.tomato.databinding.FragmentHomeBinding
import java.util.ArrayList


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.viewAllMenu.setOnClickListener {
            val bottomSheetDialog = MenuBottomSheetFragment()
            bottomSheetDialog.show(parentFragmentManager, "Test")
        }
        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.banner1, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage = "Selected Image $position"
                Toast.makeText(requireContext(), itemMessage, Toast.LENGTH_SHORT).show()
            }
        })


        val foodName = listOf("Burger", "Sandwich", "Momos", "Item")
        val price = listOf("$5", "$7", "$8", "$10")

        val popularFoodImages = listOf(
            R.drawable.menu_photo1,
            R.drawable.menu_photo2,
            R.drawable.menu_photo3,
            R.drawable.menu_photo4
        )

        val adapter = PopularAdapter(
            foodName,
            popularFoodImages,
            price
        )

        binding.PopularRecyclerView.layoutManager =
            androidx.recyclerview.widget.LinearLayoutManager(requireContext())

        binding.PopularRecyclerView.adapter = adapter

        return binding.root
    }
    companion object {

    }
}