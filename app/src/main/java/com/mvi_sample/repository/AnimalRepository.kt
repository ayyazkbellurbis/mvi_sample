package com.mvi_sample.repository

import com.mvi_sample.api.AnimalApi

class AnimalRepository(private val api: AnimalApi) {

    suspend fun getAnimals() = api.getAnimals()
}