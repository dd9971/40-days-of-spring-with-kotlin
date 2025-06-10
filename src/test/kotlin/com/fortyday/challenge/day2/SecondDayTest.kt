package com.fortyday.challenge.day2

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SecondDayTest {

    @Autowired
    private val secondDay: SecondDay? = null

    @Test
    @DisplayName("Should return Fibonacci sequence for n=5")
    fun test01() {
        //given
        val n = 5

        //when
        val result = secondDay!!.fibonacciSequence(5)

        //thend
        val expected = intArrayOf(0, 1, 1, 2, 3)
        assertThat(expected).isEqualTo(result)
    }

    @Test
    @DisplayName("Should return factorial for n=5")
    fun test02() {
        //given
        val n = 5

        //when
        val result = secondDay!!.factorial(n)

        //then
        assertThat(result).isEqualTo(120L)
    }
}