package com.spaceexam.domain.repository

import com.spaceexam.domain.model.NoteDomainModel

interface NoteRepository {
    suspend fun insertNote(note: NoteDomainModel)
    suspend fun deleteNote(id: Int)
    suspend fun getAllNotes(): List<NoteDomainModel>
}