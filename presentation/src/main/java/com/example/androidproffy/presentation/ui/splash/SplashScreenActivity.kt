package com.example.androiproffy.ui.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androiproffy.R
import com.example.androiproffy.ui.main.MainActivity
import com.example.androiproffy.ui.onBoarding.OnBoardingActivity
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlobalScope.launch {
            delay(2000L)
            startActivity(Intent(this@SplashScreenActivity, OnBoardingActivity::class.java))
            finish()
        }
    }
}