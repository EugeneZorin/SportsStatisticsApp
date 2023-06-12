package com.example.sportsstatisticsapp.domain.contract

interface NewWorkoutDataContract {
    suspend fun addNewWorkoutTransferData(inputFieldMap: Map<String, String>)
}