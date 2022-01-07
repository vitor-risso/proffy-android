package com.example.androidproffy.presentation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androidproffy.presentation.R
import com.example.androidproffy.presentation.databinding.FragmentHomeBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    val binding get() = _binding!!
    private val viewModel: HomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = DataBindingUtil.inflate<FragmentHomeBinding>(
            inflater,
            R.layout.fragment_home,
            container,
            false
        ).apply {
            viewModel = this@HomeFragment.viewModel
            lifecycleOwner = this@HomeFragment.viewLifecycleOwner
        }.also {
            setObservers()
        }


        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setObservers() {
        viewModel.shouldNavigateToGiveClasses.observe(viewLifecycleOwner) {
            it?.also {
                if (it) {
                    navigate(R.id.navigateFromHomeToGiveClasses)
                }
            }
        }

        viewModel.shouldNavigateToStudy.observe(viewLifecycleOwner) {
            it?.also {
                if (it) {

                    navigate(R.id.navigateFromHomeToStudy)
                }
            }

        }
    }

    private fun navigate(id: Int) {
        findNavController().navigate(id)
    }
}