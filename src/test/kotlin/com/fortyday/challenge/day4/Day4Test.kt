package com.fortyday.challenge.day4

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@SpringBootTest
class Day4Test {
    @Autowired
    private lateinit var context: ApplicationContext

    @Test
    @DisplayName("Should load ObjectMapper bean and serialize Kotlin class correctly")
    fun testObjectMapperBean() {
        val objectMapper = context.getBean(ObjectMapper::class.java)
        val sample = mapOf("date" to LocalDateTime.of(2025, 6, 20, 14, 30))
        val json = objectMapper.writeValueAsString(sample)

        assertThat(json).contains("2025-06-20T14:30")
    }

    @Test
    @DisplayName("Should provide DateTimeFormatter bean with expected pattern")
    fun testDateTimeFormatterBean() {
        val formatter = context.getBean(DateTimeFormatter::class.java)
        val formatted = formatter.format(LocalDateTime.of(2025, 6, 20, 14, 30))

        assertThat(formatted).isEqualTo("2025-06-20 14:30:00")
    }

    @Test
    @DisplayName("Should have CORS configurer bean loaded")
    fun testCorsConfigurerExists() {
        val corsConfigurer = context.getBean("corsConfigurer")
        assertThat(corsConfigurer).isNotNull
    }
}
