package com.example.sportsstatisticsapp.domain.repositories

interface ContractPresentationWorkoutData{
    fun contractPresentationWorkoutData(mapWorkout: MutableMap<String, String>): String
}