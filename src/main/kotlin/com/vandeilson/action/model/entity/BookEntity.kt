package com.vandeilson.action.model.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Table

@Entity
@Table(name = "book")
data class BookEntity(

    @Column(unique = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: String,

    @Column(nullable = false)
    private var title: String,

    @Column(nullable = false, name = "sub_title")
    private var subTitle: String,

    @Column(nullable = false)
    private var author: String,

    @Column(nullable = true, name = "release_year")
    private var releaseYear: String,

    @Column(nullable = false)
    private var publisher: String
)
