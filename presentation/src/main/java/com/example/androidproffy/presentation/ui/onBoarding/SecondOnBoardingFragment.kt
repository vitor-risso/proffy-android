package com.example.androidproffy.presentation.ui.onBoarding

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.androidproffy.presentation.R
import com.example.androidproffy.presentation.databinding.FragmentSecondOnBoardingBinding
import com.example.androidproffy.presentation.ui.main.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondOnBoardingFragment : Fragment() {

    private var _binding: FragmentSecondOnBoardingBinding? = null
    private val binding get() = _binding!!

    private val viewModel: SecondOnBoardingFragmentViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =
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