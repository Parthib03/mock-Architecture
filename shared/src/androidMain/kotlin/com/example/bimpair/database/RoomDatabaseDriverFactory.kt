package com.example.bimpair.database

import android.content.Context
import androidx.room.Room
import com.example.bimpair.data.local.LocalDatabase as LocalDatabaseInterface

class RoomDatabaseDriverFactory(private val context: Context) {
    fun create(): LocalDatabaseInterface {
        return Room.databaseBuilder(
            context,
            LocalDatabase::class.java,
            "bimpair.db"
        ).build()
    }
}