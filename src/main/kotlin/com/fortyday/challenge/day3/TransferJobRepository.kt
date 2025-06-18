package com.fortyday.challenge.day3

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransferJobRepository : JpaRepository<TransferJob, String>
