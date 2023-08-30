package com.spaceexam.presentation.ui.homeFragment.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.spaceexam.databinding.FragmentHomeBinding
import com.spaceexam.presentation.ui.homeFragment.adapter.NotesAdapter
import com.spaceexam.presentation.ui.homeFragment.viewmodel.HomeViewModel
import org.koin.androidx.viewmodel.ext.android.viewModelForClass

class HomeFragment : Fragment() {

    private var binding: FragmentHomeBinding? = null

    private val viewModel: HomeViewModel by viewModelForClass(HomeViewModel::class)

    private val notesAdapter by lazy {
        NotesAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        observe()
        setNavigation()
    }

    private fun initRecycler() {
        viewModel.retrieveNotes()
        binding?.notesRecyclerView?.adapter = notesAdapter
    }

    private fun observe() {
        viewModel.notesLiveData.observe(viewLifecycleOwner) { notes ->
            notes.let {
                notesAdapter.submitList(notes)
            }
        }
    }

    private fun setNavigation() {
        notesAdapter.onItemClickListener { note ->
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNoteFragment(note))
        }

        notesAdapter.onDeleteListener { note ->
            viewModel.deleteNote(note.id)
        }

        binding?.addButton?.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToNoteFragment(null))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}