package com.example.bistapp.models.detail


import com.google.gson.annotations.SerializedName

data class DetailModel(
    @SerializedName("code")
    val code: String,
    @SerializedName("data")
    val `data`: Data
)