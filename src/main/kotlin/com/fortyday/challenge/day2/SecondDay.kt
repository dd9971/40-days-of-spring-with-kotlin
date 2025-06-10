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

    fun factorial(n: Int): Long {
        require(n >= 0) { "n must be non-negative" }
        var result = 1L
        for (j in 2..n) {
            result *= j
        }
        return result
    }
}