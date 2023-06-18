package com.example.sportsstatisticsapp.di

import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractDistanceWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractRegularWorkout
import com.example.sportsstatisticsapp.domain.usecase.buildworkout.BuildRegularWorkout
import com.example.sportsstatisticsapp.domain.usecase.buildworkout.BuildWorkout
import com.example.sportsstatisticsapp.domain.usecase.buildworkout.BuildWorkoutDistance
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class BuildWorkoutModule {

    @Binds
    abstract fun bindsBuildRegularWorkout(buildRegular: BuildRegularWorkout): ContractRegularWorkout

    @Binds
    abstract fun bindsBuildDistanceWorkout(buildDistance: BuildWorkoutDistance): ContractDistanceWorkout

    @Binds
    abstract fun bindsBuildWorkout(buildWorkout: BuildWorkout): ContractBuildWorkout
}