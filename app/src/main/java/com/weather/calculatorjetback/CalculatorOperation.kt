package com.weather.calculatorjetback

sealed class CalculatorOperation(val symbol:String){

    object Add:CalculatorOperation("+")
    object Sub:CalculatorOperation("-")
    object Multiply:CalculatorOperation("*")
    object Divide:CalculatorOperation("/")
}
