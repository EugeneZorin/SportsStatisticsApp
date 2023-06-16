package com.example.sportsstatisticsapp.presentation.viewmodel.addviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sportsstatisticsapp.domain.repositories.ContractWorkoutDataImpl
import com.example.sportsstatisticsapp.presentation.contract.ButtonSaveContract
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddNewWorkoutViewModel @Inject constructor(
    private val contractWorkoutDataImpl: ContractWorkoutDataImpl,
) : ViewModel(), ButtonSaveContract {

    private val inputFieldMap = mutableMapOf<String, String>()
    fun addNewWorkout(rowID: String, nameWorkout: String) {
        inputFieldMap[rowID] = nameWorkout
    }
    override fun onButtonSave() {
        viewModelScope.launch {
            contractWorkoutDataImpl.workoutDataImpl("123", "32")
        }
    }
}