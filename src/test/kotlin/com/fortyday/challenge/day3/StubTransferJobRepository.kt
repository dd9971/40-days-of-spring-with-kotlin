package com.fortyday.challenge.day3

import org.springframework.data.domain.Example
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.repository.query.FluentQuery
import java.util.Optional
import java.util.function.Function

class StubTransferJobRepository : TransferJobRepository {

    private val storage = mutableMapOf<String, TransferJob>()


    override fun flush() {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> saveAndFlush(entity: S & Any): S & Any {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> saveAllAndFlush(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch(entities: Iterable<TransferJob?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAllByIdInBatch(ids: Iterable<String?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAllInBatch() {
        TODO("Not yet implemented")
    }

    override fun getOne(id: String): TransferJob {
        TODO("Not yet implemented")
    }

    override fun getById(id: String): TransferJob {
        TODO("Not yet implemented")
    }

    override fun getReferenceById(id: String): TransferJob {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> findAll(example: Example<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> findAll(
        example: Example<S?>,
        sort: Sort
    ): List<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> saveAll(entities: Iterable<S?>): List<S?> {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<TransferJob?> {
        TODO("Not yet implemented")
    }

    override fun findAllById(ids: Iterable<String?>): List<TransferJob?> {
        TODO("Not yet implemented")
    }

    override fun findAll(sort: Sort): List<TransferJob?> {
        TODO("Not yet implemented")
    }

    override fun findAll(pageable: Pageable): Page<TransferJob?> {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> findOne(example: Example<S?>): Optional<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> findAll(
        example: Example<S?>,
        pageable: Pageable
    ): Page<S?> {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> count(example: Example<S?>): Long {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> exists(example: Example<S?>): Boolean {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?, R : Any?> findBy(
        example: Example<S?>,
        queryFunction: Function<FluentQuery.FetchableFluentQuery<S?>?, R?>
    ): R & Any {
        TODO("Not yet implemented")
    }

    override fun <S : TransferJob?> save(entity: S & Any): S & Any {
        storage[entity.id] = entity
        return entity
    }

    override fun findById(id: String): Optional<TransferJob?> {
        return Optional.ofNullable(storage[id]) as Optional<TransferJob?>
    }

    override fun existsById(id: String): Boolean {
        TODO("Not yet implemented")
    }

    override fun count(): Long {
        TODO("Not yet implemented")
    }

    override fun deleteById(id: String) {
        TODO("Not yet implemented")
    }

    override fun delete(entity: TransferJob) {
        TODO("Not yet implemented")
    }

    override fun deleteAllById(ids: Iterable<String?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll(entities: Iterable<TransferJob?>) {
        TODO("Not yet implemented")
    }

    override fun deleteAll() {
        TODO("Not yet implemented")
    }
}