package com.example.bistapp.models.api

import com.example.bistapp.models.detail.DetailData

import com.example.bistapp.models.list.BistModel

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface BistApi {
    @GET("api/v1/hisse/list")
    fun getBistList(): Call<BistModel>

    @GET("api/v1/borsa/hisseyuzeysel/{kod}")
    fun getDetails(@Path("kod")kod: String): Call<DetailData>

}