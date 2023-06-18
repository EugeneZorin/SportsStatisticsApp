package com.example.sportsstatisticsapp.data.repository

import com.example.sportsstatisticsapp.data.models.WorkoutModel
import javax.inject.Inject

class WorkoutDataRepositoryImpl @Inject constructor(

): WorkoutDataRepository {

    override suspend fun gatWorkoutData(workoutData: WorkoutModel):WorkoutModel {
        TODO("Not yet implemented")
    }

    override suspend fun saveWorkoutData(workoutData: WorkoutModel) {
        TODO("Not yet implemented")
    }

}