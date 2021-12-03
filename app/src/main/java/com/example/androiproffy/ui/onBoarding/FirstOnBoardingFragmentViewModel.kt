package com.example.androiproffy.ui.onBoarding

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstOnBoardingFragmentViewModel() : ViewModel() {

    private lateinit var _shouldNavigateToNextScreen: MutableLiveData<Boolean>
    val shouldNavigateToNextScreen: LiveData<Boolean> get() = _shouldNavigateToNextScreen

    fun navigateToNextScreen(): Unit {
        _shouldNavigateToNextScreen.postValue(true)
        Log.d("VITOR", "navigate")
    }
}