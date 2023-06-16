package com.example.sportsstatisticsapp.domain.repositories

interface ContractWorkoutDataImpl{
    fun workoutDataImpl(mapWorkout: MutableMap<String, String>): String
}