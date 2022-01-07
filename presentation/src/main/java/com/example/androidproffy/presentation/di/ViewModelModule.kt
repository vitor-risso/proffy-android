package com.example.androiproffy.di

import com.example.androiproffy.ui.giveclasses.GiveClassesViewModel
import com.example.androiproffy.ui.home.HomeViewModel
import com.example.androiproffy.ui.onBoarding.FirstOnBoardingFragmentViewModel
import com.example.androiproffy.ui.onBoarding.SecondOnBoardingFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { FirstOnBoardingFragmentViewModel() }

    viewModel { SecondOnBoardingFragmentViewModel() }

    viewModel { HomeViewModel() }

    viewModel { GiveClassesViewModel() }
}