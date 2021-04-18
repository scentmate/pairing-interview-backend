package com.scentmate.movies

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MovieController (@Autowired private val movieRepository: MovieRepository) {

    @GetMapping("/api/movie")
    fun findAll(): ResponseEntity<List<Movie>> {
        val movies = movieRepository.findAll()
        return ResponseEntity.ok().body(movies)
    }
}