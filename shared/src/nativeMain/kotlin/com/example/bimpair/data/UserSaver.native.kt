package com.example.bimpair.data

import com.example.bimpair.data.local.LocalDatabase
import com.example.bimpair.models.User

actual suspend fun saveUserToDatabase(
    user: User,
    db: LocalDatabase
) {
}