package com.example.bistapp.model.api

import com.example.bistapp.model.detail.DetailModel
import com.example.bistapp.model.list.BistModel

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BistApi {
    @GET("api/v1/hisse/list")
    fun getBistList(): Call<BistModel>

    @GET("api/v1/borsa/hisseyuzeysel/{kod}")
    fun getDetails(@Path("kod")kod: String): Call<DetailModel>

}