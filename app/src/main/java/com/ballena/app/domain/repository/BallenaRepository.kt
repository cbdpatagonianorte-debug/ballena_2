package com.ballena.app.domain.repository

import com.ballena.app.domain.model.BallenaFranca
import kotlinx.coroutines.flow.Flow

interface BallenaRepository {
    fun getBallenas(): Flow<List<BallenaFranca>>
    suspend fun getBallenaPorId(id: String): BallenaFranca?
}
