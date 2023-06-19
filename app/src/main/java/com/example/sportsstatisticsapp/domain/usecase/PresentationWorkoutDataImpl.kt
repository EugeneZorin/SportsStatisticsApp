package com.example.sportsstatisticsapp.domain.usecase

import com.example.sportsstatisticsapp.domain.entities.Constants.COMPLETED_SUCCESSFULLY
import com.example.sportsstatisticsapp.domain.entities.Constants.ERROR
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.ALL_TIME
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.DISTANCES
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.NAME
import com.example.sportsstatisticsapp.domain.entities.ConstantsWorkout.REPLAYS
import com.example.sportsstatisticsapp.domain.repositories.ContractPresentationWorkoutData
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import javax.inject.Inject

class PresentationWorkoutDataImpl @Inject constructor(
    private val contractBuildWorkout: ContractBuildWorkout,
) : ContractPresentationWorkoutData {

    private var result = COMPLETED_SUCCESSFULLY
    private val minCriteriaRegularWorkout = listOf(NAME, REPLAYS, ALL_TIME)
    private val minCriteriaDistanceWorkout = listOf(NAME, DISTANCES, ALL_TIME)
    override fun contractPresentationWorkoutData(mapWorkout: MutableMap<String, String>): String {

        val checkingMinCriteriaRegularWorkout =
            minCriteriaRegularWorkout.all { key -> mapWorkout.containsKey(key) }
        val checkingMinCriteriaDistanceWorkout =
            minCriteriaDistanceWorkout.all { key -> mapWorkout.containsKey(key) }

        when {

            checkingMinCriteriaRegularWorkout || checkingMinCriteriaDistanceWorkout -> {
                contractBuildWorkout.contractBuildWorkout(mapWorkout)
            }

            else -> {
                result = ERROR
            }
        }
        return result

    }

}