package com.spaceexam.data.local.di

import android.content.Context
import androidx.room.Room
import com.spaceexam.data.local.database.NoteDatabase
import org.koin.dsl.module

private fun provideNoteDatabase(context: Context): NoteDatabase {
    return Room.databaseBuilder(context, NoteDatabase::class.java, "Note_database")
        .fallbackToDestructiveMigration().build()
}

val dataBaseModule = module {
    single { provideNoteDatabase(get()) }

}