package com.example.androidproffy.presentation.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidproffy.presentation.R
import com.example.androidproffy.presentation.ui.onBoarding.OnBoardingActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlobalScope.launch {
            delay(DELAY)
            startActivity(Intent(this@SplashScreenActivity, OnBoardingActivity::class.java))
            finish()
        }
    }

    companion object {
        private const val DELAY = 2000L
    }
}