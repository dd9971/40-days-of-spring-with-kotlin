package com.fortyday.challenge.day2

class SecondDay  {

    fun fibonacciSequence(i: Int): IntArray {
        val fibonacciArray = IntArray(i)
        fibonacciArray[0] = 0
        fibonacciArray[1] = 1

        for (j in 2..<i) {
            fibonacciArray[j] = fibonacciArray[j - 1] + fibonacciArray[j - 2]
        }

        return fibonacciArray
    }
}