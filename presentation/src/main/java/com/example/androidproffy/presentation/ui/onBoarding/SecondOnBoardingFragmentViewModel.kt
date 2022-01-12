package com.example.androidproffy.presentation.ui.onBoarding

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SecondOnBoardingFragmentViewModel : ViewModel() {
    private var _shouldNavigateToNextScreen = MutableLiveData<Boolean>(false)
    val shouldNavigateToNextScreen: LiveData<Boolean> get() = _shouldNavigateToNextScreen

    fun navigateToNextScreen() {
        _shouldNavigateToNextScreen.postValue(true)
        Log.d("VITOR", "navigate")
    }
}