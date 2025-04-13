package com.example.bimpair.domain.usecases

import com.example.bimpair.domain.repository.UserRepository
import kotlinx.coroutines.runBlocking

class YourUseCase(private val repository: UserRepository) {
    fun getUserName(): String = runBlocking {
        repository.getUserProfile().name // ✅ getUserProfile exists
    }
}
