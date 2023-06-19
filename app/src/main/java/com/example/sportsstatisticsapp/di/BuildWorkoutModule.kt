package com.example.sportsstatisticsapp.di

import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractWorkoutSupplements

import com.example.sportsstatisticsapp.domain.usecase.buildworkout.BuildWorkout
import com.example.sportsstatisticsapp.domain.usecase.buildworkout.WorkoutSupplements
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BuildWorkoutModule {

    @Binds
    abstract fun bindsBuildWorkout(buildWorkout: BuildWorkout): ContractBuildWorkout

    @Binds
    abstract fun bindsWorkoutSupplements(buildRegular: WorkoutSupplements): ContractWorkoutSupplements

}