package com.example.androidproffy.presentation.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    private var _shouldNavigateToGiveClasses = MutableLiveData(false)
    val shouldNavigateToGiveClasses get() = _shouldNavigateToGiveClasses

    private var _shouldNavigateToStudy = MutableLiveData(false)
    val shouldNavigateToStudy get() = _shouldNavigateToStudy

    fun navigateToGiveClasses() {
        _shouldNavigateToGiveClasses.postValue(true)
    }

    fun navigateToStudy() {
        _shouldNavigateToStudy.postValue(true)
    }
}