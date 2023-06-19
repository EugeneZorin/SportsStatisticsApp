package com.example.sportsstatisticsapp.domain.repositories

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

interface WorkoutDataRepository {
    suspend fun getWorkoutData(workoutData: WorkoutModel): WorkoutModel
    suspend fun saveWorkoutData(workoutData: WorkoutModel)
}