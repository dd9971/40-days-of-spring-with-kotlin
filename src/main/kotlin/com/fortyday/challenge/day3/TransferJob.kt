package com.fortyday.challenge.day3

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.UUID

@Entity
class TransferJob {

    @Id
    var id: String = UUID.randomUUID().toString()

    @Column(nullable = false)
    var destination: String? = null;

    @Column(nullable = false)
    var source: String? = null;
}