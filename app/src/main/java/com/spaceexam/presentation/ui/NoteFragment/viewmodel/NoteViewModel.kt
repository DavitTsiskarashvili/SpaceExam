package com.spaceexam.presentation.ui.NoteFragment.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.spaceexam.domain.model.NoteDomainModel
import com.spaceexam.domain.usecase.InsertNoteUseCase
import kotlinx.coroutines.launch

class NoteViewModel(
    private val insertNote: InsertNoteUseCase,
): ViewModel() {

    fun insertNote(note: NoteDomainModel){
        viewModelScope.launch {
            insertNote.invoke(note)
        }
    }

}