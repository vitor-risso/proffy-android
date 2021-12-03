package com.example.androiproffy.ui.OnBoarding

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.androiproffy.R

class FirstOnBoardingFragmentViewModel(private val navHostFragment: NavHostFragment) : ViewModel() {

    fun navigateToNextScreen(fragment: Fragment): Unit {
        navHostFragment.navController.navigate(R.id.navigateToSecondOnBoarding)
    }
}