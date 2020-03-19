package com.example.progrespkl.API


import com.example.progrespkl.Model.Warungkopi
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ServiceData {
    private val BASE_URL = "https://jsonplaceholder.typicode.com/"
    private val api: Data

    init {
        api = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(Data::class.java)
    }

    fun getPhotos(): Single<List<Warungkopi>> {
        return api.getPhotos()
    }
}
