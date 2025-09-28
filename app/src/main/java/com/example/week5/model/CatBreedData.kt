package com.example.week5.model

import com.squareup.moshi.Json

data class CatBreedData(
    @field:Json(name = "name") val breedName: String
)
