package com.example.androiproffy.di

import com.example.androiproffy.ui.onBoarding.FirstOnBoardingFragmentViewModel
import com.example.androiproffy.ui.onBoarding.SecondOnBoardingFragmentViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { FirstOnBoardingFragmentViewModel()}
    viewModel { SecondOnBoardingFragmentViewModel() }
}