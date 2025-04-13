package com.example.bimpair.android.di

import com.example.bimpair.data.local.LocalDatabase
import com.example.bimpair.database.RoomDatabaseDriverFactory
import com.example.bimpair.preferences.PreferenceDataSource
import com.example.bimpair.preferences.PreferenceDataSourceImpl
import org.koin.dsl.module

val androidPlatformModule = module {
    single<PreferenceDataSource> { PreferenceDataSourceImpl(context = get()) }
    single<LocalDatabase> { RoomDatabaseDriverFactory(context = get()).create() }
}