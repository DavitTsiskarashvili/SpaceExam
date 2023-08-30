package com.spaceexam.presentation.ui.homeFragment.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.spaceexam.domain.model.NoteDomainModel
import com.spaceexam.domain.usecase.DeleteNoteUseCase
import com.spaceexam.domain.usecase.GetAllNotesUseCase
import kotlinx.coroutines.launch

class HomeViewModel(
    private val getNotes: GetAllNotesUseCase,
    private val deleteNote: DeleteNoteUseCase,
): ViewModel() {

    val notesLiveData = MutableLiveData<List<NoteDomainModel>>()

    fun retrieveNotes(){
        viewModelScope.launch {
            getNotes.invoke()
        }
    }

    fun deleteNote(id: Int){
        viewModelScope.launch {
            deleteNote.invoke(id)
        }
    }

}