package com.example.sportsstatisticsapp.domain.usecase

import com.example.sportsstatisticsapp.domain.entities.WorkoutModel
import com.example.sportsstatisticsapp.domain.repositories.ContractGetWorkoutData
import com.example.sportsstatisticsapp.domain.repositories.WorkoutDataRepository
import javax.inject.Inject

class SaveWorkoutDataUseCase @Inject constructor(
    private val workoutDataRepository: WorkoutDataRepository
): ContractGetWorkoutData {

    override fun execute(workoutModel: WorkoutModel){
        workoutDataRepository.saveWorkoutData(workoutModel.toString())
    }
}