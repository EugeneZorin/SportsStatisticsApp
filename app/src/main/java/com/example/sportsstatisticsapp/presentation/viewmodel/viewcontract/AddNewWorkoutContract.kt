package com.example.sportsstatisticsapp.presentation.viewmodel.viewcontract

interface AddNewWorkoutContract {
    fun onAddNewWorkout(rowID: String, nameWorkout: String)
}