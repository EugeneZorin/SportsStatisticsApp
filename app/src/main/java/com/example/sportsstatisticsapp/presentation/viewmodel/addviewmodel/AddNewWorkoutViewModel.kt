package com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportsstatisticsapp.domain.contract.NewWorkoutDataContract
import com.example.sportsstatisticsapp.presentation.navigation.bottomnavigation.buttoncontract.ButtonSaveContract
import kotlinx.coroutines.launch

class AddNewWorkoutViewModel(

) : ViewModel(), ButtonSaveContract {

    private val inputFieldMap = mutableMapOf<String, String>()
    fun addNewWorkout(rowID: String, nameWorkout: String) {
        inputFieldMap[rowID] = nameWorkout
    }

    override fun onButtonSave() {
        viewModelScope.launch {

        }
    }

}