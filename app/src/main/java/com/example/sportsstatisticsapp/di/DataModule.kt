package com.example.sportsstatisticsapp.di

import com.example.sportsstatisticsapp.data.repository.WorkoutDataImpl
import com.example.sportsstatisticsapp.domain.repositories.ContractGetWorkoutData
import com.example.sportsstatisticsapp.domain.repositories.WorkoutDataRepository
import com.example.sportsstatisticsapp.domain.usecase.GetWorkoutDataUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bingGetWorkoutData(getWorkoutData: GetWorkoutDataUseCase): ContractGetWorkoutData

    @Binds
    abstract fun bingWorkoutRepository(repository: WorkoutDataImpl): WorkoutDataRepository
}