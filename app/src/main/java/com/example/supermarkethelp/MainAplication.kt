package com.example.supermarkethelp

import android.app.Application
import com.example.supermarkethelp.util.ModelPreferenceManager
import java.lang.IllegalStateException

class MainAplication: Application() {
    companion object{
        private var appInstance:MainAplication? = null
        fun getInstance(): MainAplication{
            if (appInstance == null){
                throw IllegalStateException("Configure a Class de aplication no AndroidManifest.xml")

            }else {
                return appInstance!!
            }
        }
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        ModelPreferenceManager.with(this)
    }
}