package com.example.androiproffy.ui.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.androiproffy.R
import com.example.androiproffy.databinding.FragmentFirstOnBoardingBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstOnBoardingFragment : Fragment() {

    private var _binding: FragmentFirstOnBoardingBinding? = null
    private val binding get() = _binding!!

    private val viewModel: FirstOnBoardingFragmentViewModel by viewModel<FirstOnBoardingFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding =
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setObservers(): Unit {
        viewModel.shouldNavigateToNextScreen.observe(viewLifecycleOwner) {
            if (it) {

            }
        }
    }
}