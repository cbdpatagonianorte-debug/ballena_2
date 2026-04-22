package com.ballena.app.domain.model

data class BallenaFranca(
    val id: String,
    val nombre: String,
    val descripcion: String,
    val latitud: Double,
    val longitud: Double,
    val nivelOxigeno: Float,
    val imageUrl: String
)
