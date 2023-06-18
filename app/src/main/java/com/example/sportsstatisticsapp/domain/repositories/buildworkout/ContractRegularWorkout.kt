package com.example.sportsstatisticsapp.domain.repositories.buildworkout

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

interface ContractRegularWorkout {
    fun contractRegularWorkout(mapWorkout: MutableMap<String, String>): WorkoutModel
}