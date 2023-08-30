package com.spaceexam.presentation.ui.NoteFragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.spaceexam.databinding.FragmentNoteBinding
import com.spaceexam.presentation.ui.NoteFragment.viewmodel.NoteViewModel
import org.koin.androidx.viewmodel.ext.android.viewModelForClass

class NoteFragment : Fragment() {

    private var binding: FragmentNoteBinding? = null

    private val viewModel: NoteViewModel by viewModelForClass(NoteViewModel::class)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val title = binding?.titleEditText?.text.toString()
        val description = binding?.noteEditText?.text.toString()
        setNavigation()

    }

    

    private fun setNavigation(){
        binding?.backButton?.setOnClickListener {
            findNavController().navigate(NoteFragmentDirections.actionNoteFragmentToHomeFragment())
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}