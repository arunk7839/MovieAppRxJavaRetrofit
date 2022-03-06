package com.c1ctech.movieapprxjavaretrofit.data.network.model

import com.c1ctech.movieapprxjavaretrofit.Movie
import com.google.gson.annotations.SerializedName

data class MovieList(@SerializedName("Search") val mList: List<Movie>)
