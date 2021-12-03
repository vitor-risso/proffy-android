package com.example.androiproffy.ui.OnBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.androiproffy.R
import com.example.androiproffy.databinding.FragmentFirstOnBoardingBinding
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class FirstOnBoardingFragment : Fragment() {

    private lateinit var binding: FragmentFirstOnBoardingBinding

    private val viewModel: FirstOnBoardingFragmentViewModel by  viewModel<FirstOnBoardingFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate<FragmentFirstOnBoardingBinding>(
                inflater,
                R.id.firstOnBoardingFragment,
                container,
                false
            ).apply {
                viewModel = this@FirstOnBoardingFragment.viewModel
            }
        return inflater.inflate(R.layout.fragment_first_on_boarding, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClicks()
    }

    private fun setClicks() {
        binding.btnArrow.setOnClickListener {
            viewModel.navigateToNextScreen(this)
        }
    }
}