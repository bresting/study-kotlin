package com.toowis

fun main() {
    val tmpList : List<String> = listOf("kotlin", "loop", "example")
    // for in
    for (tmp : String in tmpList) {
        println(tmp)
    }

    for (idx in tmpList.indices) {
        println("echo >> ${tmpList[idx]}")
    }
}