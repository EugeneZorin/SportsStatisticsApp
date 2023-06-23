package com.example.sportsstatisticsapp.domain.repositories

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

interface WorkoutDataRepository {
    fun saveWorkoutData(workoutData: String)
}