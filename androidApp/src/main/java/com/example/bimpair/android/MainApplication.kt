package com.example.bimpair.android

import android.app.Application
import com.example.bimpair.di.androidPlatformModule
import com.example.bimpair.di.commonModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)
            modules(
                androidPlatformModule, // Android-specific bindings (Room DB, Preferences, etc.)
                commonModule           // Shared module (Repositories, ViewModels, UseCases)
            )
        }
    }
}
