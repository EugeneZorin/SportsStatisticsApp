package com.example.sportsstatisticsapp.domain.usecase

import com.example.sportsstatisticsapp.domain.contract.NewWorkoutDataContract
import javax.inject.Inject

class NewWorkoutDataImpl @Inject constructor(): NewWorkoutDataContract {
    override suspend fun addNewWorkoutTransferData(inputFieldMap: Map<String, String>) {
        TODO("Not yet implemented")
    }
}