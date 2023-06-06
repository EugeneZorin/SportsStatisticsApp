package com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel

import androidx.lifecycle.ViewModel
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.buttoncontract.ButtonSaveContract

class AddNewWorkoutViewModel : ViewModel(), ButtonSaveContract {

    private val inputFieldMap = mutableMapOf<String, String>()
    fun addNewWorkout(rowID: String, nameWorkout: String){
        inputFieldMap[rowID] = nameWorkout
    }
    override fun onButtonSave() {
        TODO("Not yet implemented")
    }

}