package com.example.sportsstatisticsapp.domain.usecase.buildworkout

import android.util.Log
import com.example.sportsstatisticsapp.domain.entities.WorkoutModel
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractBuildWorkout
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractRegularWorkout
import com.google.gson.Gson
import javax.inject.Inject

class BuildRegularWorkout  @Inject constructor(
    private val contractBuildWorkout: ContractBuildWorkout
): ContractRegularWorkout {

    private val gson = Gson()
    override fun contractRegularWorkout(mapWorkout: MutableMap<String, String>): WorkoutModel {
        val constructedMap = contractBuildWorkout.contractBuildWorkout(mapWorkout)
        val json = gson.toJson(constructedMap)
        Log.d("123", "SET: $json")
        return gson.fromJson(json, WorkoutModel::class.java)
    }
}