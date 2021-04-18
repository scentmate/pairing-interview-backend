package com.scentmate.movies

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Movie (
        @Id
        val id: Long,

        @Column(nullable = false)
        val title: String,

        @Column(nullable = false)
        val description: String
)