package com.toowis

import com.toowis.unit.AddUnit
import com.toowis.util.addValue

fun main() {
    println("Package sample")
    println("echo: $PGM_NAME")

    val tmpCalc = addValue(10, 20)
    println("1. echo addValue : $tmpCalc")

    println("2. echo addValue : ${addValue(15, 20)}")
    println("3. echo addValue : ${addValue(15, 20, AddUnit.THREE)}")
    try {
        println("4. echo addValue : ${addValue(15, 20, AddUnit.X)}")
    } catch (e : IllegalArgumentException) {
        print("Catched_Exception:: ${e.message}")
    }
}

