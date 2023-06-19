package com.example.sportsstatisticsapp.domain.repositories.buildworkout

interface ContractWorkoutSupplements {
    fun contractWorkoutSupplements(mapWorkout: MutableMap<String, String>): MutableMap<String, String>
}