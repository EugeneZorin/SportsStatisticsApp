package com.example.sportsstatisticsapp.domain.repositories.buildworkout

interface ContractBuildWorkout {
    fun contractBuildWorkout(mapWorkout: MutableMap<String, String>): MutableMap<String, String>
}