package com.josancamon19.composemvvm.network

import com.josancamon19.composemvvm.models.Recipe
import com.josancamon19.composemvvm.models.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

const val BASE_URL = "https://food2fork.ca/api/recipe/"
const val TOKEN = "9c8b06d329136da358c2d00e76946b0111ce2c48"

val retrofitService = Retrofit.Builder().baseUrl(BASE_URL)
    .addConverterFactory(GsonConverterFactory.create())
    .build()
    .create(RecipeService::class.java)

interface RecipeService {
    @GET("search")
    suspend fun search(
        @Header("Authorization") token: String = TOKEN,
        @Query("page") page: Int,
        @Query("query") query: String
    ): Response

    @GET("get")
    suspend fun get(
        @Header("Authorization") token: String = TOKEN,
        @Query("id") id: Int
    ): Recipe


}