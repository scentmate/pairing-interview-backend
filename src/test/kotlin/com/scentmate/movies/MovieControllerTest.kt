package com.scentmate.movies

import org.junit.jupiter.api.Test
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Assertions.*

internal class MovieControllerTest {

    private val repository : MovieRepository = mock()
    private val controller = MovieController(repository)

    @Test
    fun findAll_should_return_nothing_because_db_is_empty() {
        val response = controller.findAll()

        assertEquals(200, response.statusCodeValue)
        assertEquals(emptyList<Movie>(), response.body)
    }

    @Test
    fun findAll_should_return_entries_contained_in_repo() {
        val movie1 = Movie(id = 1, title = "Wonder Woman 1984", description = "See data.sql")
        val movie2 = Movie(id = 2, title = "Pulp Fiction", description = "Check out moviedb.org for more information")

        whenever(repository.findAll()).thenReturn(listOf(movie1, movie2))

        val response = controller.findAll()

        assertEquals(200, response.statusCodeValue)
        assertEquals(listOf(movie1, movie2), response.body)
    }
}