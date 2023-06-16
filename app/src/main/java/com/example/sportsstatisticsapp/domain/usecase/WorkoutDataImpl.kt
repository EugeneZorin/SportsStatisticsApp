package com.example.sportsstatisticsapp.domain.usecase

import com.example.sportsstatisticsapp.domain.repositories.ContractWorkoutDataImpl
import javax.inject.Inject

class WorkoutDataImpl @Inject constructor(): ContractWorkoutDataImpl {

    override fun workoutDataImpl(mapWorkout: MutableMap<String, String>): String {
        TODO()
    }

}