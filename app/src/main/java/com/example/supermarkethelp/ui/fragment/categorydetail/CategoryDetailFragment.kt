package com.example.supermarkethelp.ui.fragment.categorydetail


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.supermarkethelp.R
import com.example.supermarkethelp.ui.activity.MainActivity


class CategoryDetailFragment : Fragment() {

    private var getTitleCategory =  ""
    private lateinit var produto1: EditText
    private lateinit var produto2: EditText
    private lateinit var produto3: EditText
    private lateinit var produto4: EditText
    private lateinit var produto5: EditText
    private lateinit var produto6: EditText
    private lateinit var produto7: EditText
    private lateinit var produto8: EditText
    private lateinit var produto9: EditText
    private lateinit var produto10: EditText
    private lateinit var produto11: EditText
    private lateinit var produto12: EditText
    private lateinit var produto13: EditText
    private lateinit var produto14: EditText
    private lateinit var produto15: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if(arguments != null){
            val args = arguments
            getTitleCategory = args?.getString("category").toString().trim()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_category_detail, container, false)
       setupToolbarPickTitle()
        initializeView (root)
        return root
    }

    private fun initializeView(root: View?) {

    }

    private fun setupToolbarPickTitle() {
        (activity as MainActivity).supportActionBar?.title = "Categoria: ${getTitleCategory}"
    }
}