package com.example.samplerestapitest

import androidx.lifecycle.*


class SampleViewModel: ViewModel(){
    val posts: LiveData<ArrayList<Post>> = liveData{
        emit(repo.getPosts(service))
    }
    suspend fun getPost(): ArrayList<Post>{
        return repo.getPosts(service)
    }



    val repo = SampleRepo()
    val service = NetworkService.NetworkService()

}