package com.example.samplerestapitest

import androidx.lifecycle.LiveData

class SampleRepo{

    suspend fun getPosts(service: CallAdapter): ArrayList<Post>{
        return service.getPosts()
    }
}