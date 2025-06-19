package com.fortyday.challenge.day3

import jakarta.persistence.LockModeType
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Lock
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface TransferJobRepository : JpaRepository<TransferJob, String>{

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT t FROM TransferJob t WHERE t.id = :id")
    fun findByIdForUpdate(id: String): Optional<TransferJob>
}