package com.example.androiproffy.ui.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.androiproffy.databinding.FragmentSecondOnBoardingBinding

class SecondOnBoardingFragment : Fragment() {

    private lateinit var viewModel: SecondOnBoardingFragmentViewModel

    private lateinit var binding: FragmentSecondOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondOnBoardingBinding.inflate(inflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SecondOnBoardingFragmentViewModel::class.java)
        // TODO: Use the ViewModel
    }
}