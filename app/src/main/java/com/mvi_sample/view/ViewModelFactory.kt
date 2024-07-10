package com.mvi_sample.view

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mvi_sample.api.AnimalApi
import com.mvi_sample.repository.AnimalRepository

class ViewModelFactory(private val  api: AnimalApi): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            return MainViewModel(AnimalRepository(api)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}