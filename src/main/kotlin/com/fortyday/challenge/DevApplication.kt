package com.fortyday.challenge

import com.fortyday.challenge.day1.FirstDay
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class DevApplication {

	@Bean
	fun initializeDays(firstDay: FirstDay): CommandLineRunner {
		return CommandLineRunner {
			println("Application started...")
			firstDay.testDbConnection()
		}
	}
}

fun main(args: Array<String>) {
	runApplication<DevApplication>(*args)
}