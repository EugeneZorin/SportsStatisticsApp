package com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel

import com.example.sportsstatisticsapp.domain.contract.NewWorkoutDataContract

class AddNewWorkoutTransferDataImpl(
    private val addNewWorkoutContract: NewWorkoutDataContract
) {
    suspend fun processTransferData(inputFieldMap: Map<String, String>){
        addNewWorkoutContract.addNewWorkoutTransferData(inputFieldMap)

    }
}