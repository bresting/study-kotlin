package com.toowis.util

import com.toowis.unit.AddUnit

fun addValue(val1:Int, val2:Int) = val1 + val2

fun addValue(val1:Int, val2:Int, unit:AddUnit) : Int {
    return when (unit) {
        AddUnit.ONE   -> val1 + val2 + 1
        AddUnit.TWO   -> val1 + val2 + 2
        AddUnit.THREE -> val1 + val2 + 3
        else -> throw IllegalArgumentException("Check unit")
    }
}