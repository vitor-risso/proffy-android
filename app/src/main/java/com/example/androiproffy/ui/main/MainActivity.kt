package com.example.androiproffy.ui.main

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import com.example.androiproffy.R
import com.example.androiproffy.databinding.ActivityMainBinding

// É necessário configurar o View Pager para que cê consiga acessar as outras Fragments
class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_first_on_boarding)
    }

}
