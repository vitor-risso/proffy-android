package com.example.androiproffy.ui.giveclasses

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.androiproffy.R
import com.example.androiproffy.databinding.FragmentGiveClassesBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class GiveClassesFragment : Fragment() {

    private var _binding: FragmentGiveClassesBinding? = null
    private val binding get() = _binding!!

    private val viewModel: GiveClassesViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DataBindingUtil.inflate<FragmentGiveClassesBinding>(
            inflater,
            R.layout.fragment_give_classes,
            container,
            false
        ).apply {
            viewModel = this@GiveClassesFragment.viewModel
            lifecycleOwner = lifecycleOwner
        }

        setObservers()

        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun setObservers() {
        viewModel.shouldNavigateBackHome.observe(viewLifecycleOwner) {
            it?.apply {
                if (it) {
                    findNavController().navigate(R.id.navigateFromGiveClassesToHome)
                }
            }
        }
    }
}