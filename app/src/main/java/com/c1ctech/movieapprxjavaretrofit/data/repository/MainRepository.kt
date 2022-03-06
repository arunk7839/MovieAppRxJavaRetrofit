package com.c1ctech.movieapprxjavaretrofit.data.repository

import com.c1ctech.movieapprxjavaretrofit.data.network.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}