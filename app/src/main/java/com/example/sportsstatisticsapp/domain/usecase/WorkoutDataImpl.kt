package com.example.sportsstatisticsapp.domain.usecase

import android.util.Log
import com.example.sportsstatisticsapp.domain.repositories.ContractWorkoutDataImpl
import javax.inject.Inject

class WorkoutDataImpl @Inject constructor(): ContractWorkoutDataImpl {
    override fun workoutDataImpl(rowID: String, nameWorkout: String): String {
        Log.d("AAAA", "SET: $rowID")
        return "213"
    }
}