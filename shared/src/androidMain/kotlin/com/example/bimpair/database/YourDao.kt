package com.example.bimpair.database

import androidx.room.*

@Dao
interface YourDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entity: YourEntity)

    @Query("SELECT * FROM YourEntity")
    suspend fun getAll(): List<YourEntity>
}
