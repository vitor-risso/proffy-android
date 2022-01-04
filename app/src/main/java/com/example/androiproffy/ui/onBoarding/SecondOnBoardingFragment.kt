package com.example.androiproffy.ui.onBoarding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.androiproffy.R
import com.example.androiproffy.databinding.FragmentSecondOnBoardingBinding
import com.example.androiproffy.ui.main.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondOnBoardingFragment : Fragment() {

    private val viewModel: SecondOnBoardingFragmentViewModel by viewModel()

    private lateinit var binding: FragmentSecondOnBoardingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate<FragmentSecondOnBoardingBinding>(
                inflater,
                R.layout.fragment_second_on_boarding,
                container,
                false
            ).apply {
                viewModel = this@SecondOnBoardingFragment.viewModel
                lifecycleOwner = viewLifecycleOwner
            }.also {
                setObservers()
            }
        return binding.root
    }

    private fun setObservers() {
        viewModel.shouldNavigateToNextScreen.observe(viewLifecycleOwner) {
            if (it) {
                startActivity(Intent(context, MainActivity::class.java))
                activity?.finish()
            }
        }
    }
}