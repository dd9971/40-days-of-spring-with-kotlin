package com.fortyday.challenge.day3

import jakarta.persistence.Id
import lombok.Locked
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

    fun deleteEntity(id: Id) {
        repository.deleteById(id.toString())
    }

    fun updateEntity(id: String, newSource: String) {
        val optionalEntity = repository.findByIdForUpdate(id)
        if (!optionalEntity.isPresent) {
            throw IllegalArgumentException("Entity with id $id not found")
        }
        val entity = optionalEntity.get();
        entity.destination = "new/destination"
        repository.save(entity)
    }

    fun listEntities(): List<TransferJob> {
        return repository.findAll()
    }
}