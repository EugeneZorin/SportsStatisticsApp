package com.example.sportsstatisticsapp.domain.repositories

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

interface ContractGetWorkoutData {
    fun execute(workoutModel: WorkoutModel)
}