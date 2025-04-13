package com.example.bimpair.di

import com.example.bimpair.domain.repository.UserRepository
import com.example.bimpair.domain.repository.UserRepositoryImpl
import com.example.bimpair.domain.usecases.YourUseCase
import com.example.bimpair.presentation.viewmodels.SharedViewModel
import org.koin.dsl.module

val commonModule = module {
    single<UserRepository> { UserRepositoryImpl(get(), get()) } // Pass HttpClient and LocalDatabase
    single { YourUseCase(get()) }
    single { SharedViewModel(get()) }
}
