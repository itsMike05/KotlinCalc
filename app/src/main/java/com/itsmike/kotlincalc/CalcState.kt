package com.itsmike.kotlincalc

data class CalcState(
    val number1: String,
    val number2: String,
    val operation: CalcOperation? = null
)
