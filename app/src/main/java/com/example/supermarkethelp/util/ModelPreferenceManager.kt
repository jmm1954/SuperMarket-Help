package com.example.supermarkethelp.util

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.supermarkethelp.model.*
import com.google.gson.GsonBuilder

object ModelPreferenceManager {

    private const val PREFERENCE_FILE_NAME = "Compras"
    lateinit var preferences: SharedPreferences

    fun with(application: Application){
        preferences = application.getSharedPreferences(PREFERENCE_FILE_NAME, Context.MODE_PRIVATE)
    }

    fun remove (key: String) = preferences.edit().remove(key).apply()

    fun insertCleaningObject(cleaningObject: Cleaning, key: String) {
        val jsonString = GsonBuilder().create().toJson(cleaningObject)
        preferences.edit().putString(key, jsonString). apply()
    }

    fun insertHigieneObject(hygieneObject: Hygiene, key: String) {
        val jsonString = GsonBuilder().create().toJson(hygieneObject)
        preferences.edit().putString(key, jsonString). apply()

    }

    fun insertFoodsObject(foodsObject: Foods, key: String) {
        val jsonString = GsonBuilder().create().toJson(foodsObject)
        preferences.edit().putString(key, jsonString). apply()

    }

    fun insertDrinksObject(drinksObject: Drinks, key: String) {
        val jsonString = GsonBuilder().create().toJson(drinksObject)
        preferences.edit().putString(key, jsonString). apply()

    }

    fun insertOthersObject(othersObject: Others, key: String) {
        val jsonString = GsonBuilder().create().toJson(othersObject)
        preferences.edit().putString(key, jsonString). apply()

    }
}