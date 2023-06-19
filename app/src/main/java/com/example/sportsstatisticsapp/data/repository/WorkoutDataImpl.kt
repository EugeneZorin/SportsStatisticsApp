package com.example.sportsstatisticsapp.data.repository


import android.util.Log
import com.example.sportsstatisticsapp.data.models.WorkoutModelOne
import com.example.sportsstatisticsapp.domain.entities.WorkoutModel

import com.example.sportsstatisticsapp.domain.repositories.WorkoutDataRepository
import javax.inject.Inject

class WorkoutDataImpl @Inject constructor(): WorkoutDataRepository{



    override fun getWorkoutData(workoutData: WorkoutModel): WorkoutModel {
        TODO("Not yet implemented")
    }

    override fun saveWorkoutData(workoutData: com.example.sportsstatisticsapp.domain.entities.WorkoutModel) {

    }


}
