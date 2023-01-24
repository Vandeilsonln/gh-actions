package com.vandeilson.action.repository

import com.vandeilson.action.model.entity.BookEntity
import org.springframework.data.jpa.repository.JpaRepository

interface BookRepository: JpaRepository<BookEntity, Long> {
}