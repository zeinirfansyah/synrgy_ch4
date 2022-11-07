package com.zen.notapp.database

import androidx.room.*

@Dao
interface NotesDAO {
    @Insert
    suspend fun addNote(note: Notes)

    @Update
    suspend fun updateNote(note:Notes)

    @Delete
    suspend fun deleteNote(note: Notes)

    @Query("SELECT * FROM note_table")
    suspend fun getNotes(note: Notes): List<Notes>
}