package com.example.supermarkethelp.ui.fragment.categories.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.supermarkethelp.R
import com.example.supermarkethelp.databinding.CardviewItemCategoryBinding
import com.example.supermarkethelp.model.Category

class CategoriesAdapter (
    val categories:MutableList<Category>,
    val onClick: (String) ->Unit
    ): RecyclerView.Adapter<CategoriesAdapter.CategoriesViewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= CategoriesViewholder (
        LayoutInflater.from(parent.context).inflate(R.layout.cardview_item_category, parent, false)
            )

    override fun onBindViewHolder(holder: CategoriesViewholder, position: Int) {
       val category = categories [position]
           with (holder) {
            binding.cardviewTitle.text = category.titleCategoty
            binding.cardviewImage.setImageResource(category.imageCategory)
            binding.cardview.setOnClickListener { onClick (category.titleCategoty)}
        }
    }
    override fun getItemCount()= categories.size

    class CategoriesViewholder(view: View): RecyclerView.ViewHolder(view) {
        val binding = CardviewItemCategoryBinding.bind(view)
    }
}