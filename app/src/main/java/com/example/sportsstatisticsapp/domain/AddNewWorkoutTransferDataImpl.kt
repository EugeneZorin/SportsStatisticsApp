package com.example.sportsstatisticsapp.domain

import com.example.sportsstatisticsapp.domain.contract.AddNewWorkoutContract

class AddNewWorkoutTransferDataImpl(private val addNewWorkoutContract: AddNewWorkoutContract) {

    suspend fun processTransferData(inputFieldMap: Map<String, String>){
        addNewWorkoutContract.addNewWorkoutTransferData(inputFieldMap)

    }
}