package com.example.bimpair.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.bimpair.data.local.LocalDatabase as LocalDatabaseInterface

@Database(entities = [YourEntity::class], version = 1)
abstract class LocalDatabase : RoomDatabase(), LocalDatabaseInterface {

    abstract fun yourDao(): YourDao

    override fun clearAll() {
        // Optional: Clear tables here
        // Example: yourDao().deleteAll()
    }
}