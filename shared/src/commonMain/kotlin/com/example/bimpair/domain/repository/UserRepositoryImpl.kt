package com.example.bimpair.domain.repository

import com.example.bimpair.data.local.LocalDatabase
import com.example.bimpair.models.User
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class UserRepositoryImpl(
    private val client: HttpClient,
    private val db: LocalDatabase
) : UserRepository {

    override suspend fun login(email: String, password: String): User {
        val response: HttpResponse = client.post("https://your-api.com/login") {
            setBody(mapOf("email" to email, "password" to password))
        }
        val user = response.body<User>()

        // TODO: Save user to local DB if needed
        return user
    }

    override suspend fun getUserProfile(): User {
        val response: HttpResponse = client.get("https://your-api.com/user")
        return response.body()
    }

    override suspend fun clear() {
        db.clearAll()
    }
}