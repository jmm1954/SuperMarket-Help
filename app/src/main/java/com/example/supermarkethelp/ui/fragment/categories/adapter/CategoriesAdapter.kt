package com.example.supermarkethelp.ui.fragment.categories.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.supermarkethelp.R
import com.example.supermarkethelp.model.Category
import kotlinx.android.synthetic.main.cardview_item_category.view.*

class CategoriesAdapter (
    val categories:MutableList<Category>,
    val onClick: (String) ->Unit
    ): RecyclerView.Adapter<CategoriesAdapter.CategoriesViewolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= CategoriesViewolder (
        LayoutInflater.from(parent.context).inflate(R.layout.cardview_item_category, parent, false)
            )

    override fun onBindViewHolder(holder: CategoriesViewolder, position: Int) {
       val category = categories [position]
        val view = holder.itemView

        with (view) {
            cardview_title.text = category.titleCategoty
            cardview_image.setImageResource(category.imageCategory)
            cardview.setOnClickListener { onClick (category.titleCategoty)}
        }
    }
    override fun getItemCount()= categories.size

    class CategoriesViewolder(view: View): RecyclerView.ViewHolder(view)
}