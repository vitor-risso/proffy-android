package com.example.androiproffy.ui.onBoarding

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androiproffy.R
import com.example.androiproffy.databinding.FragmentFirstOnBoardingBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstOnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentFirstOnBoardingBinding

    private val viewModel: FirstOnBoardingFragmentViewModel by viewModel<FirstOnBoardingFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate<FragmentFirstOnBoardingBinding>(
                inflater,
                R.layout.fragment_first_on_boarding,
                container,
                false
            ).apply {
                viewModel = this@FirstOnBoardingFragment.viewModel
                lifecycleOwner = viewLifecycleOwner
            }
        setObservers()
        return binding.root
    }

    private fun setObservers(): Unit {
        viewModel.shouldNavigateToNextScreen.observe(viewLifecycleOwner) {
            if (it) {
                findNavController().navigate(R.id.navigateToSecondOnBoarding)
                Log.d("VITOR", "CHEGOU")
            }
        }
    }
}