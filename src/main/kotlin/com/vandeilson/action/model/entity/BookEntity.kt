package com.vandeilson.action.model.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "book")
data class BookEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private var id: Long? = null,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false, name = "sub_title")
    var subTitle: String,

    @Column(nullable = false)
    var author: String,

    @Column(nullable = true, name = "release_year")
    var releaseYear: String,

    @Column(nullable = false)
    var publisher: String
) {
    constructor(): this(null, "", "", "", "", "")
}
