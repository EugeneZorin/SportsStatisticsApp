package com.example.sportsstatisticsapp.domain.usecase.buildworkout

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractDistanceWorkout
import com.google.gson.Gson
import javax.inject.Inject

class BuildWorkoutDistance @Inject constructor(): ContractDistanceWorkout {

    private val gson = Gson()
    override fun contractDistanceWorkout(mapWorkout: MutableMap<String, String>): WorkoutModel {
        val json = gson.toJson(mapWorkout)
        return gson.fromJson(json, WorkoutModel::class.java)
    }
}