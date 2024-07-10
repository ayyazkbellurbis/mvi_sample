package com.mvi_sample.view

import com.mvi_sample.model.Animal

sealed class MainState() {
    object Idle : MainState()
    object Loading : MainState()
    data class Animals(val animals: List<Animal>) : MainState()
    data class Error(val error: String) : MainState()
}