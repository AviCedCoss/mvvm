package com.example.mvvm.backend

import retrofit2.http.GET
import retrofit2.http.Query
import spartons.com.koinmvvm.activities.main.data.MovieCollection


interface ServiceUtil {

    @GET(value = "popular")
    suspend fun popularMovies(
        @Query(
            value = "api_key",
            encoded = false
        ) apiKey: String, @Query(value = "page") pageNumber: Int = 1
    ): MovieCollection
}