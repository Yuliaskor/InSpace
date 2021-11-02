package com.example.inspace.api

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("articles?_limit=100")
    fun getData(): Call<List<MyDataItem>?>?
}