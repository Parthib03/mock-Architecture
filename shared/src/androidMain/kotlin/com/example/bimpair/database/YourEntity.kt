package com.example.bimpair.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class YourEntity(
    @PrimaryKey val id: String,
    val name: String,
    val email: String,
    val token: String
)
