package com.mvi_sample.view

sealed class MainIntent {
    object FetchAnimals: MainIntent()
}