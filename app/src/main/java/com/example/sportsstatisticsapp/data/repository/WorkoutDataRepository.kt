package com.example.sportsstatisticsapp.data.repository

import com.example.sportsstatisticsapp.data.models.WorkoutModel


interface WorkoutDataRepository {
    suspend fun gatWorkoutData(workoutData: WorkoutModel): WorkoutModel
    suspend fun saveWorkoutData(workoutData: WorkoutModel)
}