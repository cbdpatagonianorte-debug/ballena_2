package com.ballena.app.data.repository

import com.ballena.app.domain.model.BallenaFranca
import com.ballena.app.domain.repository.BallenaRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class BallenaRepositoryImpl @Inject constructor() : BallenaRepository {

    override fun getBallenas(): Flow<List<BallenaFranca>> = flowOf(
        listOf(
            BallenaFranca(
                id = "1",
                nombre = "Franca Austral",
                descripcion = "Avistada en Peninsula Valdes. Estado: saludable.",
                latitud = -42.5,
                longitud = -64.2,
                nivelOxigeno = 0.87f,
                imageUrl = ""
            ),
            BallenaFranca(
                id = "2",
                nombre = "Franca del Sur",
                descripcion = "Migrando hacia aguas templadas.",
                latitud = -38.1,
                longitud = -57.5,
                nivelOxigeno = 0.62f,
                imageUrl = ""
            )
        )
    )

    override suspend fun getBallenaPorId(id: String): BallenaFranca? = null
}
