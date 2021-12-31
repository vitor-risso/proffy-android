package com.example.androiproffy.ui.onBoarding

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter( fm: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fm, lifecycle) {
    private val screens =
        arrayListOf(
            FirstOnBoardingFragment(), SecondOnBoardingFragment()
        )

    override fun getItemCount(): Int {
        return screens.size
    }


    override fun createFragment(position: Int): Fragment {
        return screens[position]
    }
}