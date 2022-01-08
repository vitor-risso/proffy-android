package com.example.androidproffy

import android.app.Application
import com.example.androidproffy.presentation.di.viewModelModule
import di.apiModule
import di.useCaseModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@MyApplication)
            modules(
                viewModelModule,
                apiModule,
                useCaseModule
            )
        }
    }
}