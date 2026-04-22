package com.ballena.app.di

import com.ballena.app.data.repository.BallenaRepositoryImpl
import com.ballena.app.domain.repository.BallenaRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule {

    @Binds
    @Singleton
    abstract fun bindBallenaRepository(
        impl: BallenaRepositoryImpl
    ): BallenaRepository
}
