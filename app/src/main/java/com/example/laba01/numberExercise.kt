package com.example.laba01

import kotlin.random.Random

class numberExercise {
    val numbers: List<Int> = List(20) { Random.nextInt(-100, 100) }

    fun getNums() : String {
        return numbers.toString()
    }

    fun getPositiveCount() : String {
        return numbers.count { it > 0 }.toString()
    }

    fun getNegativeSum() : String {
        return numbers.filter { it < 0 }.sum().toString()
    }
}