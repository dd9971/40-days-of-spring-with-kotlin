package com.fortyday.challenge.day3

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/test")
class TransferJobController(private val thirdDay: ThirdDay) {

    @GetMapping("/save")
    fun saveEntity(): TransferJob {
        return thirdDay.saveAndRetrieveEntity()
    }
}