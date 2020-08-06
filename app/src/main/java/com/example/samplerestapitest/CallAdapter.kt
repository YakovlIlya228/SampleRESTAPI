package com.example.samplerestapitest

import androidx.lifecycle.LiveData
import retrofit2.http.GET

interface CallAdapter {
    @GET("/posts")
    suspend fun getPosts(): ArrayList<Post>
}