package com.example.sportsstatisticsapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.sportsstatisticsapp.presentation.viewmodel.viewcontract.AddNewWorkoutContract

class MyViewModel : ViewModel(), AddNewWorkoutContract {
    override fun addNewWorkout(rowID: String, nameWorkout: String) {
        TODO("Not yet implemented")
    }
}