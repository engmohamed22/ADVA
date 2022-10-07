package com.example.adva.data.network


import com.example.adva.data.models.ImagesResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query



interface ApiInterface {
    @GET("/photos")
    suspend fun getImages(
        @Query("page") page: Int,
        @Query("per_page") per_page: Int
    ): Response<List<ImagesResponseItem>>

}



