package com.itsmike.kotlincalc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalcVM : ViewModel() {

    var state by mutableStateOf(CalcState())
        private set

    fun onAction (action : CalcAction){

        when(action) {
            is CalcAction.Number -> enterNumber(action.number)
            is CalcAction.DecimalPoint -> enterDecimal()
            is CalcAction.Clear -> state = CalcState()
            is CalcAction.Operation -> enterOperation(action.operation)
            is CalcAction.Calculate -> performCalculation()
            is CalcAction.Delete -> performDeletion()
        }

    }

    private fun performDeletion() {
        TODO("Not yet implemented")
    }

    private fun performCalculation() {
        TODO("Not yet implemented")
    }

    private fun enterOperation(operation: CalcOperation) {

    }

    private fun enterDecimal() {
        TODO("Not yet implemented")
    }

    private fun enterNumber(number: Int) {

    }
}