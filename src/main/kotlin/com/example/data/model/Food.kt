package com.example.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Food(
    val name: String,
    val description: String,
    val imageUrl: String
)
