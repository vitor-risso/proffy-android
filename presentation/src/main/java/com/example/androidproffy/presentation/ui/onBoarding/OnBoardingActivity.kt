package com.example.androidproffy.presentation.ui.onBoarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.androidproffy.presentation.databinding.ActivityOnBoardingBinding

class OnBoardingActivity : AppCompatActivity() {

    private var _binding: ActivityOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityOnBoardingBinding.inflate(layoutInflater)

        val screens =
            arrayListOf(
                FirstOnBoardingFragment(binding.viewPager), SecondOnBoardingFragment()
            )

        binding.viewPager.adapter = ViewPagerAdapter(supportFragmentManager, lifecycle, screens)

        binding.indicator.setViewPager(binding.viewPager)

        setContentView(binding.root)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}