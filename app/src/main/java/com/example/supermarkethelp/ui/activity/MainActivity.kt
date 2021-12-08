package com.example.supermarkethelp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.supermarkethelp.R
import com.example.supermarkethelp.ui.fragment.categories.CategoriesFragment

class MainActivity : AppCompatActivity() {
    private val manager = supportFragmentManager
    private val categoriesFragmentTag = "CategoriesFragment"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.toolbar))

        manager.beginTransaction().add(R.id.container_fragment, CategoriesFragment(), categoriesFragmentTag).commit()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if(manager.findFragmentByTag(categoriesFragmentTag)?.isVisible!!){
            supportActionBar?.let{
                it.setTitle("Principal - Categorias")
                it.setDisplayShowHomeEnabled(false)
                it.setDisplayHomeAsUpEnabled(false)
            }

        }

    }
}