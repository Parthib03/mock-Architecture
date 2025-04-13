package com.example.bimpair.preferences

interface PreferenceDataSource {
    fun getToken(): String
    fun saveToken(token: String)
}
