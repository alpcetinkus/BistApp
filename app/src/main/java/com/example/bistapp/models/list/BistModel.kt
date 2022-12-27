package com.example.bistapp.models.list


import com.example.bistapp.models.list.Data
import com.google.gson.annotations.SerializedName

data class BistModel(
    @SerializedName("data")
    val `data`: List<Data>
)