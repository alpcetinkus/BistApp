package com.example.bistapp.model.list


import com.google.gson.annotations.SerializedName

data class BistModel(
    @SerializedName("data")
    val `data`: List<Data>
)