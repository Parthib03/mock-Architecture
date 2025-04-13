package com.example.bimpair.preferences

interface PreferenceDataSource {
    fun saveToken(token: String)
    fun getToken(): String?
}