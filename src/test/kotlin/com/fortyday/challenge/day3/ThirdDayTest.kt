package com.fortyday.challenge.day3

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

internal class ThirdDayTest {

    lateinit var thirdDay: ThirdDay;
    lateinit var fakeRepository: StubTransferJobRepository;

    @BeforeEach
    fun setUp() {
        fakeRepository = StubTransferJobRepository()
        thirdDay = ThirdDay(fakeRepository)
    }

    @Test
    @DisplayName("Should return saved entity with id")
    fun test01() {
        //given

        //when
        var result = thirdDay.saveAndRetrieveEntity();

        //then
        assertThat(result).isNotNull()
        assertThat(result.id).isNotBlank()
    }
}