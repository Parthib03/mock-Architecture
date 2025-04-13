package com.example.bimpair.data.local

interface LocalDatabase {
    fun yourDao(): YourDao
    fun clearAll()
}