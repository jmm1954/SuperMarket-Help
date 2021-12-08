package com.example.supermarkethelp.ui.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.supermarkethelp.MainAplication
import com.example.supermarkethelp.R

class SplashScreenActivity : AppCompatActivity() {

    private val handler = Handler(Looper.getMainLooper())
    private val appContext= MainAplication.getInstance().applicationContext
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        handler.postDelayed({
            startActivity(Intent(appContext, MainActivity::class.java))
            finish()
        }, 3000)

    }
}