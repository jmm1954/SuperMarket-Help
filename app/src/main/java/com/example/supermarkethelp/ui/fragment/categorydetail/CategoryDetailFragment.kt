package com.example.supermarkethelp.ui.fragment.categorydetail


import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

import com.example.supermarkethelp.MainAplication
import com.example.supermarkethelp.R
import com.example.supermarkethelp.model.*
import com.example.supermarkethelp.ui.activity.MainActivity
import com.example.supermarkethelp.util.ModelPreferenceManager
import java.lang.Exception
import kotlin.concurrent.thread


class CategoryDetailFragment : Fragment() {

    private var getTitleCategory =  ""
    private var handler= Handler (Looper.getMainLooper())
    private val prefs = ModelPreferenceManager
    private val appContext = MainAplication.getInstance().applicationContext
    private lateinit var btnSave: Button
    private lateinit var btnRemove: Button
    private lateinit var product1: EditText
    private lateinit var product2: EditText
    private lateinit var product3: EditText
    private lateinit var product4: EditText
    private lateinit var product5: EditText
    private lateinit var product6: EditText
    private lateinit var product7: EditText
    private lateinit var product8: EditText
    private lateinit var product9: EditText
    private lateinit var product10: EditText
    private lateinit var product11: EditText
    private lateinit var product12: EditText
    private lateinit var product13: EditText
    private lateinit var product14: EditText
    private lateinit var product15: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

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
       setupToolbar()
        initializeView (root)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        try {
            setupDataFromTitlePick(getTitleCategory)
            showDataFromTitlePick(getTitleCategory)
        }catch (e:Exception){
            Log.e("CategoryDetailFragment", "OnViewCriated " + e.message.toString())
        }finally{
            Thread.setDefaultUncaughtExceptionHandler { t, e ->
                Log.e("CategoryDetailFragment", "Caught Thread" + e.message.toString())
            }
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            android.R.id.home -> (activity as MainActivity).onBackPressed()
        }
        return true
    }

    private fun showDataFromTitlePick(titleCategory: String) {
        when (titleCategory){
            "Limpeza"-> getCleaningSavedData()
            "Higiene" -> getHygieneSavedData()
            "Alimentação" -> getFoodsSavedData()
            "Bebidas" -> getDrinksSavedData()
            "Outros" -> getOthetsSavedData()
        }

    }

    private fun getOthetsSavedData() {
        thread { //faz rodar em uma thread segundária ou segundo plano
            val getObject = prefs.getOthersObject("KEY_OTHERS")
            handler.post{ //para que isto aconteça na main thread ou Ui Thread
                product1.setText(getObject.product1)
                product2.setText(getObject.product2)
                product3.setText(getObject.product3)
                product4.setText(getObject.product4)
                product5.setText(getObject.product5)
                product6.setText(getObject.product6)
                product7.setText(getObject.product7)
                product8.setText(getObject.product8)
                product9.setText(getObject.product9)
                product10.setText(getObject.product10)
                product11.setText(getObject.product11)
                product12.setText(getObject.product12)
                product13.setText(getObject.product13)
                product14.setText(getObject.product14)
                product15.setText(getObject.product15)
            }
        }.start()

    }

    private fun getDrinksSavedData() {
        thread{
            val getObject = prefs.getDrinksObject("KEY_DRINKS")
            handler.post{ //para que isto aconteça na main thread ou Ui Thread
                product1.setText(getObject.product1)
                product2.setText(getObject.product2)
                product3.setText(getObject.product3)
                product4.setText(getObject.product4)
                product5.setText(getObject.product5)
                product6.setText(getObject.product6)
                product7.setText(getObject.product7)
                product8.setText(getObject.product8)
                product9.setText(getObject.product9)
                product10.setText(getObject.product10)
                product11.setText(getObject.product11)
                product12.setText(getObject.product12)
                product13.setText(getObject.product13)
                product14.setText(getObject.product14)
                product15.setText(getObject.product15)
            }
        }.start()
    }

    private fun getFoodsSavedData() {
        thread {
            val getObject = prefs.getFoodsObject("KEY_FOODS")
            handler.post{ //para que isto aconteça na main thread ou Ui Thread
                product1.setText(getObject.product1)
                product2.setText(getObject.product2)
                product3.setText(getObject.product3)
                product4.setText(getObject.product4)
                product5.setText(getObject.product5)
                product6.setText(getObject.product6)
                product7.setText(getObject.product7)
                product8.setText(getObject.product8)
                product9.setText(getObject.product9)
                product10.setText(getObject.product10)
                product11.setText(getObject.product11)
                product12.setText(getObject.product12)
                product13.setText(getObject.product13)
                product14.setText(getObject.product14)
                product15.setText(getObject.product15)
            }
        }.start()

    }

    private fun getHygieneSavedData() {
        thread {
            val getObject = prefs.getHygieneObject("KEY_HYGIENE")
            handler.post{ //para que isto aconteça na main thread ou Ui Thread
                product1.setText(getObject.product1)
                product2.setText(getObject.product2)
                product3.setText(getObject.product3)
                product4.setText(getObject.product4)
                product5.setText(getObject.product5)
                product6.setText(getObject.product6)
                product7.setText(getObject.product7)
                product8.setText(getObject.product8)
                product9.setText(getObject.product9)
                product10.setText(getObject.product10)
                product11.setText(getObject.product11)
                product12.setText(getObject.product12)
                product13.setText(getObject.product13)
                product14.setText(getObject.product14)
                product15.setText(getObject.product15)
            }
        }.start()
     }

    private fun getCleaningSavedData() {
        thread {
            val getObject = prefs.getCleaningObject("KEY_CLEANING")

            handler.post { //para que isto aconteça na main thread ou Ui Thread
                product1.setText(getObject.product1)
                product2.setText(getObject.product2)
                product3.setText(getObject.product3)
                product4.setText(getObject.product4)
                product5.setText(getObject.product5)
                product6.setText(getObject.product6)
                product7.setText(getObject.product7)
                product8.setText(getObject.product8)
                product9.setText(getObject.product9)
                product10.setText(getObject.product10)
                product11.setText(getObject.product11)
                product12.setText(getObject.product12)
                product13.setText(getObject.product13)
                product14.setText(getObject.product14)
                product15.setText(getObject.product15)
            }
        }.start()

    }


    private fun setupDataFromTitlePick(titleCategory: String) {

        when (titleCategory){

            "Limpeza"-> {
                onBtbSaveClick ("KEY_CLEANING")
                onBtnRemoveClick ("KEY_CLEANING")
            }
            "Higiene" ->{
                onBtbSaveClick ("KEY_HYGIENE")
                onBtnRemoveClick ("KEY_HYGIENE")
            }
            "Alimentação" ->{
                onBtbSaveClick ("KEY_FOODS")
                onBtnRemoveClick ("KEY_FOODS")
            }
            "Bebidas" ->{
                onBtbSaveClick ("KEY_DRINKS")
                onBtnRemoveClick ("KEY_DRINKS")
            }
            "Outros" ->{
                onBtbSaveClick ("KEY_OTHERS")
                onBtnRemoveClick ("KEY_OTHERS")
            }
        }

    }

    private fun onBtnRemoveClick(key: String) {
        btnRemove.setOnClickListener {
            when (key){
                "KEY_CLEANING"-> removeObject("KEY_CLEANING")
                "KEY_HYGIENE" -> removeObject("KEY_HYGIENE")
                "KEY_FOODS" ->   removeObject("KEY_FOODS")
                "KEY_DRINKS" ->  removeObject("KEY_DRINKS")
                "KEY_OTHERS" ->  removeObject("KEY_OTHERS")

            }
            refreshList()
            Toast.makeText(appContext, "Itens removidos com sucesso!", Toast.LENGTH_SHORT).show()
        }


    }

    private fun removeObject(key: String) = prefs.remove(key)

    private fun refreshList() {
        product1.setText("")
        product2.setText("")
        product3.setText("")
        product4.setText("")
        product5.setText("")
        product6.setText("")
        product7.setText("")
        product8.setText("")
        product9.setText("")
        product10.setText("")
        product11.setText("")
        product12.setText("")
        product13.setText("")
        product14.setText("")
        product15.setText("")
    }

    private fun onBtbSaveClick(key: String) {

        btnSave.setOnClickListener {
            when (key){
                "KEY_CLEANING"-> insertCleaningObject()
                "KEY_HYGIENE" -> insertHygieneObject()
                "KEY_FOODS" ->   insertFoodsObject()
                "KEY_DRINKS" ->  insertObjectDrinks()
                "KEY_OTHERS" ->  insertObjectOthers()

            }
            Toast.makeText(appContext, "Lista Salva com sucesso!", Toast.LENGTH_SHORT).show()
        }

    }

    private fun insertObjectOthers() {
        prefs.insertOthersObject(
            Others(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ),"KEY_OTHERS"
        )
    }

    private fun insertObjectDrinks() {
        prefs.insertDrinksObject(
            Drinks(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ),"KEY_DRINKS"
        )
    }

    private fun insertFoodsObject() {
        prefs.insertFoodsObject(
            Foods(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ),"KEY_FOODS"
        )
    }

    private fun insertHygieneObject() {
        prefs.insertHigieneObject(
            Hygiene(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ),"KEY_HYGIENE"
        )
    }

    private fun insertCleaningObject() {
        prefs.insertCleaningObject(
            Cleaning(
                product1.text.toString().trim(),
                product2.text.toString().trim(),
                product3.text.toString().trim(),
                product4.text.toString().trim(),
                product5.text.toString().trim(),
                product6.text.toString().trim(),
                product7.text.toString().trim(),
                product8.text.toString().trim(),
                product9.text.toString().trim(),
                product10.text.toString().trim(),
                product11.text.toString().trim(),
                product12.text.toString().trim(),
                product13.text.toString().trim(),
                product14.text.toString().trim(),
                product15.text.toString().trim()
            ),"KEY_CLEANING"
        )
    }

    private fun initializeView(root: View) {
        btnSave = root.findViewById(R.id.btn_save_list)
        btnRemove = root.findViewById(R.id.btn_remove_list)
        product1 = root.findViewById(R.id.product_1)
        product2 = root.findViewById(R.id.product_2)
        product3 = root.findViewById(R.id.product_3)
        product4 = root.findViewById(R.id.product_4)
        product5 = root.findViewById(R.id.product_5)
        product6 = root.findViewById(R.id.product_6)
        product7 = root.findViewById(R.id.product_7)
        product8 = root.findViewById(R.id.product_8)
        product9 = root.findViewById(R.id.product_9)
        product10 = root.findViewById(R.id.product_10)
        product11 = root.findViewById(R.id.product_11)
        product12 = root.findViewById(R.id.product_12)
        product13 = root.findViewById(R.id.product_13)
        product14 = root.findViewById(R.id.product_14)
        product15 = root.findViewById(R.id.product_15)

    }

    private fun setupToolbar() {
        (activity as MainActivity).supportActionBar?.let{
            it.title = "Categoria: ${getTitleCategory}"
            it.setDisplayHomeAsUpEnabled(true)
            it.setDisplayShowHomeEnabled(true)
        }
    }
}