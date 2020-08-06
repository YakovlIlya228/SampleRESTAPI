package com.example.samplerestapitest

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class SampleViewModel: ViewModel(){
    val posts: LiveData<ArrayList<Post>> = liveData {
        val data = repo.getPosts(service)
        emit(data)
    }

    val repo = SampleRepo()
    val service = NetworkService.NetworkService()

}