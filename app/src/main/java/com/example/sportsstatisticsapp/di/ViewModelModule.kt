package com.example.sportsstatisticsapp.di

import com.example.sportsstatisticsapp.domain.repositories.ContractWorkoutDataImpl
import com.example.sportsstatisticsapp.domain.usecase.WorkoutDataImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @ViewModelScoped
    @Binds
    abstract fun bindDataRepository(repository: WorkoutDataImpl): ContractWorkoutDataImpl
}

