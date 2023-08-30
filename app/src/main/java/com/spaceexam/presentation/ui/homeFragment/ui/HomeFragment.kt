package com.spaceexam.presentation.ui.homeFragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.spaceexam.databinding.FragmentFirstBinding
import com.spaceexam.presentation.ui.homeFragment.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModelForClass

class HomeFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    private val viewModel: HomeViewModel by viewModelForClass(HomeViewModel::class)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding!!.root
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }



}