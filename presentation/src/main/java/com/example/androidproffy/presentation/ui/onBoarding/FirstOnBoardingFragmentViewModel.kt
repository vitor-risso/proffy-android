package com.example.androidproffy.presentation.ui.onBoarding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstOnBoardingFragmentViewModel : ViewModel() {

    private var _shouldNavigateToNextScreen = MutableLiveData<Boolean>(false)
    val shouldNavigateToNextScreen: LiveData<Boolean> get() = _shouldNavigateToNextScreen

    fun navigateToNextScreen() {
        _shouldNavigateToNextScreen.postValue(true)
    }
}