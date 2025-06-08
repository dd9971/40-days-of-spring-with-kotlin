package com.fortyday.challenge.day1

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.stereotype.Component

@Component
class FirstDay(private val jdbcTemplate: JdbcTemplate) {
    fun testDbConnection() {
        val count = jdbcTemplate.queryForObject("SELECT 1", Int::class.java)
        println("▶️ DB test query returned: $count")
    }
}