package com.example.supermarkethelp.ui.fragment.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.supermarkethelp.R
import com.example.supermarkethelp.model.Category
import com.example.supermarkethelp.ui.activity.MainActivity
import com.example.supermarkethelp.ui.fragment.categories.adapter.CategoriesAdapter
import com.example.supermarkethelp.ui.fragment.categorydetail.CategoryDetailFragment


class CategoriesFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as MainActivity).title = "Principal - Categorias"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val root = inflater.inflate(R.layout.fragment_categories, container, false)
        inicializeviews(root)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        recyclerView.let {
        it.layoutManager= LinearLayoutManager(requireActivity())
        it.itemAnimator = DefaultItemAnimator()
        it.setHasFixedSize(true)
        it.adapter = CategoriesAdapter(addCategories()){categoryTitle ->
            arguments = Bundle().apply {
                putString("category", categoryTitle)
            }
            val fragmentDetails = CategoryDetailFragment()
            fragmentDetails.arguments = arguments
            (activity as MainActivity)
                .supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_fragment, fragmentDetails)
                .addToBackStack(null)
                .commit()
        }
        }
    }

    private fun addCategories() = mutableListOf(

        Category("Limpeza", R.drawable.ic_cleaning),
        Category("Higiene", R.drawable.ic_higiene),
        Category("Alimentação", R.drawable.ic_foods),
        Category("Bebidas", R.drawable.ic_beverage),
        Category("Outros", R.drawable.ic_other)

    )

    private fun inicializeviews(root: View) {
        recyclerView= root.findViewById(R.id.recyclerview_categories)

    }
}

