package com.spaceexam.data.local.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.spaceexam.data.local.dao.NoteDao
import com.spaceexam.data.local.entity.NoteEntity

@Database(entities = [NoteEntity::class], version = 1)

abstract class NoteDatabase : RoomDatabase() {
    abstract fun noteDao(): NoteDao
}