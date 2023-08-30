package com.spaceexam.data.mapper

import com.spaceexam.data.local.entity.NoteEntity
import com.spaceexam.domain.model.NoteDomainModel

class NoteDomainToEntity : Mapper<NoteDomainModel, NoteEntity> {
    override fun invoke(model: NoteDomainModel): NoteEntity =
        with(model) {
            NoteEntity(
                id = id,
                title = title,
                description = description
            )
        }
}