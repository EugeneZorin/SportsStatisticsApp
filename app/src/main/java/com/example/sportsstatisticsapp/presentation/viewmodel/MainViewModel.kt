package com.example.sportsstatisticsapp.presentation.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val inputFieldMap = mutableMapOf<String, String>()
    fun addNewWorkout(rowID: String, nameWorkout: String){
        inputFieldMap[rowID] = nameWorkout
    }


}