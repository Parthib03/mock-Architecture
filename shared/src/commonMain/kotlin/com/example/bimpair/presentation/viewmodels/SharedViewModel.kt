package com.example.bimpair.presentation.viewmodels

import com.example.bimpair.domain.usecases.YourUseCase

class SharedViewModel(private val useCase: YourUseCase) {
    fun getData(): String = useCase.getUserName()
}
