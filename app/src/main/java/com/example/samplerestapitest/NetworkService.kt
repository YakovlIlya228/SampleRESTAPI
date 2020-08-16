package com.example.samplerestapitest

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object NetworkService{
    val BASE_URL = "https://jsonplaceholder.typicode.com"
    fun createInterceptor(): OkHttpClient{
        val logging: HttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
        return OkHttpClient.Builder().addInterceptor(logging).build()
    }
    fun NetworkService(): CallAdapter{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(createInterceptor())
            .addConverterFactory(GsonConverterFactory.create())
            .build().create(CallAdapter ::class.java)
    }
}