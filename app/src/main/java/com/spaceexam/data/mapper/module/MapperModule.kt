package com.spaceexam.data.mapper.module

import com.spaceexam.data.mapper.NoteDomainToEntity
import com.spaceexam.data.mapper.NoteEntityToDomain
import org.koin.dsl.module

val databaseMapperModule =  module {
    single { NoteDomainToEntity() }
    single { NoteEntityToDomain() }
}