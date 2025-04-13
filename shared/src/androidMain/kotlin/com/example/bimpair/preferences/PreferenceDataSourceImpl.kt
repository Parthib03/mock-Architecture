package com.example.bimpair.preferences

import android.content.Context

class PreferenceDataSourceImpl(private val context: Context) : PreferenceDataSource {
    private val prefs = context.getSharedPreferences("prefs", Context.MODE_PRIVATE)

    override fun getToken(): String = prefs.getString("token", "") ?: ""

    override fun saveToken(token: String) {
        prefs.edit().putString("token", token).apply()
    }
}
