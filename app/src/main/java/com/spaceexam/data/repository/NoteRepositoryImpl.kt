package com.spaceexam.data.repository

import com.spaceexam.data.local.dao.NoteDao
import com.spaceexam.data.mapper.NoteDomainToEntity
import com.spaceexam.data.mapper.NoteEntityToDomain
import com.spaceexam.domain.model.NoteDomainModel
import com.spaceexam.domain.repository.NoteRepository

class NoteRepositoryImpl(
    private val noteDao: NoteDao,
    private val domainToEntity: NoteDomainToEntity,
    private val entityToDomain: NoteEntityToDomain
) : NoteRepository {
    override suspend fun insertNote(note: NoteDomainModel) {
        noteDao.insertNote(domainToEntity(note))
    }

    override suspend fun deleteNote(id: Int) {
        noteDao.deleteNote(id)
    }

    override suspend fun getAllNotes(): List<NoteDomainModel> {
        return noteDao.getAllNotes().map { entityToDomain(it) }
    }
}