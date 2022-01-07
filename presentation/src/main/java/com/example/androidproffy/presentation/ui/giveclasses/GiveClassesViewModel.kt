package com.example.androidproffy.presentation.ui.giveclasses

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GiveClassesViewModel : ViewModel() {
    private var _shouldNavigateBackHome = MutableLiveData<Boolean>(false)
    val shouldNavigateBackHome: LiveData<Boolean> get() = _shouldNavigateBackHome

    fun navigateBackHome() {
        _shouldNavigateBackHome.postValue(true)
    }
}