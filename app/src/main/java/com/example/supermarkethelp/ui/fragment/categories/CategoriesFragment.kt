package com.example.supermarkethelp.ui.fragment.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.supermarkethelp.R
import com.example.supermarkethelp.ui.activity.MainActivity


class CategoriesFragment : Fragment() {

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
        return root
    }
}

