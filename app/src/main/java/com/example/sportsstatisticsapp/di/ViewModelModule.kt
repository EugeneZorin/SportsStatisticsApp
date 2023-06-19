package com.example.sportsstatisticsapp.di

import com.example.sportsstatisticsapp.domain.repositories.ContractPresentationWorkoutData
import com.example.sportsstatisticsapp.domain.usecase.PresentationWorkoutDataImpl
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
    abstract fun bindDataRepository(repository: PresentationWorkoutDataImpl): ContractPresentationWorkoutData
}

