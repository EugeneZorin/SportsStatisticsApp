package com.example.sportsstatisticsapp.domain.di

import com.example.sportsstatisticsapp.domain.contract.NewWorkoutDataContract
import com.example.sportsstatisticsapp.domain.usecase.NewWorkoutDataImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
object MyModule {

    @Provides
    fun provideNewWorkoutDataContract(): NewWorkoutDataContract{
        return NewWorkoutDataImpl()
    }
}