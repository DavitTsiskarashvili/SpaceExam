package com.spaceexam.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.spaceexam.data.local.entity.NoteEntity

@Dao
interface NoteDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NoteEntity)

    @Query("DELETE FROM NOTES WHERE id=:id")
    suspend fun deleteNote(id: Int)

    @Query("SELECT * FROM notes")
    suspend fun getAllNotes(): List<NoteEntity>
}