package com.example.sportsstatisticsapp.domain.usecase

import com.example.sportsstatisticsapp.domain.models.ConstantsWorkout.ALL_TIME
import com.example.sportsstatisticsapp.domain.models.ConstantsWorkout.DISTANCES
import com.example.sportsstatisticsapp.domain.models.ConstantsWorkout.NAME
import com.example.sportsstatisticsapp.domain.models.ConstantsWorkout.REPLAYS
import com.example.sportsstatisticsapp.domain.repositories.ContractWorkoutDataImpl
import javax.inject.Inject

class WorkoutDataImpl @Inject constructor(): ContractWorkoutDataImpl {


    override fun workoutDataImpl(mapWorkout: MutableMap<String, String>): String {

        val result = "ERROR"

        val listFirstTrainingOption = listOf(NAME, REPLAYS, ALL_TIME)
        val listSecondTrainingOption = listOf(NAME, DISTANCES, ALL_TIME)

        val checkingFirstTrainingOption = listFirstTrainingOption.all { key -> mapWorkout.containsKey(key) }
        val checkingSecondTrainingOption = listSecondTrainingOption.all { key -> mapWorkout.containsKey(key) }

        when {
            checkingFirstTrainingOption -> {

            }
            checkingSecondTrainingOption -> {

            }
            else -> {

            }
        }

        return result

    }

}