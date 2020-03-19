package com.example.progrespkl.API

import com.example.progrespkl.Model.Warungkopi
import io.reactivex.Single
import retrofit2.http.GET

interface Data {
    @GET("photos")
    fun getPhotos(): Single<List<Warungkopi>>

}