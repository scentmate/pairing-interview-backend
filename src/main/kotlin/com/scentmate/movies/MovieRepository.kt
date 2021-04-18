package com.scentmate.movies

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Component

@Component
interface MovieRepository : JpaRepository<Movie, Long> {
    override fun findAll(): List<Movie>
}