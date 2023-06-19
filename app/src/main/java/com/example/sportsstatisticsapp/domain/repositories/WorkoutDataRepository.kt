package com.example.sportsstatisticsapp.domain.repositories

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

interface WorkoutDataRepository {
    fun getWorkoutData(workoutData: WorkoutModel): WorkoutModel
    fun saveWorkoutData(workoutData: WorkoutModel)
}