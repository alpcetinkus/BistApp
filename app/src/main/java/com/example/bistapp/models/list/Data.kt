package com.example.bistapp.models.list


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("ad")
    val ad: String,

    @SerializedName("kod")
    val kod: String

)