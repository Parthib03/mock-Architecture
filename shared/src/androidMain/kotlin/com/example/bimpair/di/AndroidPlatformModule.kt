package com.example.bimpair.di

import com.example.bimpair.data.remote.HttpClientFactory
import com.example.bimpair.data.local.LocalDatabase as LocalDatabaseInterface
import com.example.bimpair.database.RoomDatabaseDriverFactory
import com.example.bimpair.preferences.PreferenceDataSource
import com.example.bimpair.preferences.PreferenceDataSourceImpl
import org.koin.dsl.module

val androidPlatformModule = module {
    single<PreferenceDataSource> { PreferenceDataSourceImpl(context = get()) }
    single<LocalDatabaseInterface> { RoomDatabaseDriverFactory(context = get()).create() }
    single { HttpClientFactory.create() }
}
