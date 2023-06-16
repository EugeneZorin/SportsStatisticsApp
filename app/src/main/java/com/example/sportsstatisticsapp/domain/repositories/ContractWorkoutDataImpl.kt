package com.example.sportsstatisticsapp.domain.repositories

interface ContractWorkoutDataImpl{
    fun workoutDataImpl(rowID: String, nameWorkout: String): String
}