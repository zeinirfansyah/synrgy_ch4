package com.zen.notapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class User (
    var username: String? = null,
    var password: String? = null
) {
    @PrimaryKey(autoGenerate = true) var id: Int = 0
}