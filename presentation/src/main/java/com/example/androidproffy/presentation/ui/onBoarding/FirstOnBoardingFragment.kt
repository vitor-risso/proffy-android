package com.example.androidproffy.presentation.ui.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.androidproffy.presentation.R
import com.example.androidproffy.presentation.databinding.FragmentFirstOnBoardingBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstOnBoardingFragment(private val view: ViewPager2) : Fragment() {

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
                view.currentItem = view.currentItem + 1
            }
        }
    }
}