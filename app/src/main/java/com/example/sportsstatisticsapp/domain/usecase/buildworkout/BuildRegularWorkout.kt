package com.example.sportsstatisticsapp.domain.usecase.buildworkout

import com.example.sportsstatisticsapp.domain.entities.Constants.VOID
import com.example.sportsstatisticsapp.domain.entities.WorkoutModel
import com.example.sportsstatisticsapp.domain.repositories.buildworkout.ContractRegularWorkout
import com.google.gson.Gson
import javax.inject.Inject

class BuildRegularWorkout  @Inject constructor(): ContractRegularWorkout {

    private val gson = Gson()
    override fun contractRegularWorkout(mapWorkout: MutableMap<String, String>): WorkoutModel {
        val json = gson.toJson(mapWorkout)
        return gson.fromJson(json, WorkoutModel::class.java)
    }
}