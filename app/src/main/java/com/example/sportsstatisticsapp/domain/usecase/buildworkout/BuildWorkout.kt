package com.example.sportsstatisticsapp.domain.usecase.buildworkout


import com.example.sportsstatisticsapp.domain.entities.WorkoutModel
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractWorkoutSupplements
import com.google.gson.Gson
import javax.inject.Inject

class BuildWorkout  @Inject constructor(
    private val contractWorkoutSupplements: ContractWorkoutSupplements
): ContractBuildWorkout {

    private val gson = Gson()


    override fun contractBuildWorkout(mapWorkout: MutableMap<String, String>) {
        val constructedMap = contractWorkoutSupplements.contractWorkoutSupplements(mapWorkout)
        val json = gson.toJson(constructedMap)
        gson.fromJson(json, WorkoutModel::class.java)
    }
}