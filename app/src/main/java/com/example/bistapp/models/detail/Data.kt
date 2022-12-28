package com.example.bistapp.models.detail


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("ccI14")
    val ccI14: Any,
    @SerializedName("hisseYuzeysel")
    val hisseYuzeysel: HisseYuzeysel,
    @SerializedName("mov10")
    val mov10: Any,
    @SerializedName("rsI14")
    val rsI14: Any,
    @SerializedName("stc_5_3")
    val stc53: Any
)