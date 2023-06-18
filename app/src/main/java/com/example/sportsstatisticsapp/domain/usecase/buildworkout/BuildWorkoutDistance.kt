package com.example.sportsstatisticsapp.domain.usecase.buildworkout

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractDistanceWorkout
import com.google.gson.Gson
import javax.inject.Inject

class BuildWorkoutDistance @Inject constructor(
    private val contractBuildWorkout: ContractBuildWorkout
): ContractDistanceWorkout {

    private val gson = Gson()
    override fun contractDistanceWorkout(mapWorkout: MutableMap<String, String>) {
        val constructedMap = contractBuildWorkout.contractBuildWorkout(mapWorkout)
        val json = gson.toJson(constructedMap)
        gson.fromJson(json, WorkoutModel::class.java)
    }
}