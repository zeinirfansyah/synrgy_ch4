package com.zen.notapp.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Notes (
    @PrimaryKey(autoGenerate = true)
    val noteId: Long? = null,

    @ColumnInfo(name = "note_title")
    var title: String,

    @ColumnInfo(name = "note_content")
    var content:String,

    @ColumnInfo(name = "note_time")
    val timeStamp: Int
)