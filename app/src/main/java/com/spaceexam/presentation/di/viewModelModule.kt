package com.spaceexam.presentation.di

import com.spaceexam.presentation.ui.homeFragment.viewmodel.HomeViewModel
import com.spaceexam.presentation.ui.thirdFragment.viewmodel.ThirdViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel() }
    viewModel { HomeViewModel() }
    viewModel { ThirdViewModel() }

}