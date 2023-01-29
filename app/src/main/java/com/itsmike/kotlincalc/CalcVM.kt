package com.itsmike.kotlincalc

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalcVM : ViewModel() {

    var state by mutableStateOf(CalcState())
        private set
}