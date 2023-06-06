package com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel.viewcontract

interface AddNewWorkoutContract {
    fun onAddNewWorkout(rowID: String, nameWorkout: String)
}