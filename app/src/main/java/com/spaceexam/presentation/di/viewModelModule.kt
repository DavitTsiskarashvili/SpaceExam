package com.spaceexam.presentation.di

import com.spaceexam.presentation.ui.NoteFragment.viewmodel.NoteViewModel
import com.spaceexam.presentation.ui.homeFragment.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { HomeViewModel(getNotes = get(), deleteNote = get()) }
    viewModel { NoteViewModel(insertNote = get()) }
}