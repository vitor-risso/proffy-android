package com.example.androidproffy.presentation.di

import com.example.androidproffy.presentation.ui.giveclasses.GiveClassesViewModel
import com.example.androidproffy.presentation.ui.home.HomeViewModel
import com.example.androidproffy.presentation.ui.onBoarding.FirstOnBoardingFragmentViewModel
import com.example.androidproffy.presentation.ui.onBoarding.SecondOnBoardingFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { FirstOnBoardingFragmentViewModel() }

    viewModel { SecondOnBoardingFragmentViewModel() }

    viewModel { HomeViewModel() }

    viewModel { GiveClassesViewModel() }
}