package com.example.sportsstatisticsapp.domain.contract

interface AddNewWorkoutContract {
    suspend fun addNewWorkoutTransferData(inputFieldMap: Map<String, String>)
}