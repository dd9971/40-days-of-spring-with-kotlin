package com.fortyday.challenge.day3

import org.springframework.stereotype.Service

@Service
class ThirdDay(
    private val repository: TransferJobRepository
) {

    fun getUnpersistEntity(): TransferJob {
        return TransferJob().apply {
            destination = "localhost:/mnt"
            source = "/mnt/remote"
        }
    }

    fun saveAndRetrieveEntity(): TransferJob {
        val entity = getUnpersistEntity()
        repository.save(entity)
        return repository.findById(entity.id).orElseThrow()
    }
}