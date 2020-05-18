package com.example.retrofitmviedb.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MovieViewModel: ViewModel() {

    var result: MutableLiveData<List<Result>> = MutableLiveData()

    fun getResult(): LiveData<List<Result>> = result

    private val movieApi: MovieApi = MovieApi()

    fun loadResult() {
        val apiCall = movieApi.getMovie("e180bf7bddd48a41f6dc6afd38888c0b")

        apiCall.enqueue(object : Callback<Movie>{

        })

    }
}