package com.example.bimpair.data.local

interface YourDao {
    suspend fun insert(entity: UserEntity)
}