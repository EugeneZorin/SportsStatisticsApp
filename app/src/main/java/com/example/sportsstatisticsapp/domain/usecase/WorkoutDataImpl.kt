package com.example.sportsstatisticsapp.domain.usecase

import android.util.Log
import com.example.sportsstatisticsapp.domain.entities.Constants.COMPLETED_SUCCESSFULLY
import com.example.sportsstatisticsapp.domain.entities.Constants.ERROR
import com.example.sportsstatisticsapp.domain.entities.Constants.VOID
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.ALL_TIME
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.DISTANCES
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.NAME
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.REPLAYS
import com.example.sportsstatisticsapp.domain.repositories.ContractWorkoutDataImpl
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractDistanceWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractRegularWorkout
import javax.inject.Inject

class WorkoutDataImpl @Inject constructor(
    private val contractRegularWorkout: ContractRegularWorkout,
    private val contractDistanceWorkout: ContractDistanceWorkout
): ContractWorkoutDataImpl {

    private var result = COMPLETED_SUCCESSFULLY
    private val listFirstTrainingOption = listOf(NAME, REPLAYS, ALL_TIME)
    private val listSecondTrainingOption = listOf(NAME, DISTANCES, ALL_TIME)
    override fun workoutDataImpl(mapWorkout: MutableMap<String, String>): String {

        val checkingFirstTrainingOption = listFirstTrainingOption.all { key -> mapWorkout.containsKey(key) }
        val checkingSecondTrainingOption = listSecondTrainingOption.all { key -> mapWorkout.containsKey(key) }

        when {

            checkingFirstTrainingOption -> {
                contractRegularWorkout.contractRegularWorkout(mapWorkout)
            }

            checkingSecondTrainingOption -> {
                contractDistanceWorkout.contractDistanceWorkout(mapWorkout)
            }

            else -> {
                result = ERROR
            }
        }

        return result

    }

}