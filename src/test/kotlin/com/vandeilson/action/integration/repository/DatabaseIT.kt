package com.vandeilson.action.integration.repository

import com.vandeilson.action.model.entity.BookEntity
import com.vandeilson.action.repository.BookRepository
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import javax.transaction.Transactional

@SpringBootTest
class DatabaseIT {

    @Autowired
    private lateinit var bookRepository: BookRepository

    @Test
    @Transactional
    @Rollback
    fun `save book to database`() {
        val book = BookEntity(null, "Book title3", "Book subtitle3", "Eilson3", "20003", "Herbert Richter3")
        bookRepository.save(book)

        val book2 = BookEntity(null, "Book title33", "Book subtitle33", "Eilson33", "200033", "Herbert Richter33")
        bookRepository.save(book2)

        assertEquals(2, bookRepository.findAll().size)
    }

    @Test
    @Transactional
    @Rollback
    fun `save book to database 2`() {
        val book = BookEntity(null, "Book title5", "Book subtitle4", "Eilson4", "20004", "Herbert Richter4")
        bookRepository.save(book)

        val book2 = BookEntity(null, "Book title55", "Book subtitle55", "Eilson55", "200055", "Herbert Richter55")
        bookRepository.save(book2)

        val book3 = BookEntity(null, "Book title555", "Book subtitle555", "Eilson555", "2000555", "Herbert Richter555")
        bookRepository.save(book3)

        assertEquals(3, bookRepository.findAll().size)
    }
}