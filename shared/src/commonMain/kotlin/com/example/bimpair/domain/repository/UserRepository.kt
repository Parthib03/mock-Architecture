package com.example.bimpair.domain.repository

import com.example.bimpair.models.User

interface UserRepository {
    suspend fun login(email: String, password: String): User
    suspend fun getUserProfile(): User
    suspend fun clear()
}