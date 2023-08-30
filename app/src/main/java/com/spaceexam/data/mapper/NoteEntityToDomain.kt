package com.spaceexam.data.mapper

import com.spaceexam.data.local.entity.NoteEntity
import com.spaceexam.domain.model.NoteDomainModel

class NoteEntityToDomain : Mapper<NoteEntity, NoteDomainModel> {
    override fun invoke(model: NoteEntity): NoteDomainModel =
        with(model) {
            NoteDomainModel(
                id = id,
                title = title,
                description = description
            )
        }
}