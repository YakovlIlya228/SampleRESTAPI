package com.example.samplerestapitest

import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object NetworkService{
    val BASE_URL = "https://jsonplaceholder.typicode.com"

    fun NetworkService(): CallAdapter{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(CallAdapter ::class.java)
    }
}