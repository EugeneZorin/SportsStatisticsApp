package com.example.sportsstatisticsapp.domain.repositories.buildworkout

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

interface ContractDistanceWorkout {
    fun contractDistanceWorkout(mapWorkout: MutableMap<String, String>)
}