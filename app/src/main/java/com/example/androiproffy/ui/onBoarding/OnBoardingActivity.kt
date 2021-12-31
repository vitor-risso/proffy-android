package com.example.androiproffy.ui.onBoarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androiproffy.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOnBoardingBinding.inflate(layoutInflater)
        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        binding.indicator.setViewPager(binding.viewPager)
        setContentView(binding.root)
    }
}