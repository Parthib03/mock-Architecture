package com.example.bimpair.data

import com.example.bimpair.data.local.LocalDatabase
import com.example.bimpair.models.User

expect suspend fun saveUserToDatabase(user: User, db: LocalDatabase)