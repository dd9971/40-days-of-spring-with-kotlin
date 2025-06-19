package com.fortyday.challenge.day3

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.Getter
import lombok.Setter
import java.util.UUID

@Entity
@Getter
@Setter
class TransferJob {

    @Id
    var id: String = UUID.randomUUID().toString()

    @Column(nullable = false)
    var destination: String? = null;

    @Column(nullable = false)
    var source: String? = null;
}