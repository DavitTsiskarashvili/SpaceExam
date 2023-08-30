package com.spaceexam.presentation.ui.NoteFragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.spaceexam.databinding.FragmentSecondBinding
import com.spaceexam.presentation.ui.NoteFragment.viewmodel.NoteViewModel
import org.koin.androidx.viewmodel.ext.android.viewModelForClass

class NoteFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null

    private val viewModel: NoteViewModel by viewModelForClass(NoteViewModel::class)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding!!.root
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}