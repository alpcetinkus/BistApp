package com.example.bistapp.model.detail


import com.google.gson.annotations.SerializedName

data class HisseYuzeysel(
    @SerializedName("aciklama")
    val aciklama: String,
    @SerializedName("acilis")
    val acilis: Double,
    @SerializedName("alis")
    val alis: Double,
    @SerializedName("aorT1")
    val aorT1: Double,
    @SerializedName("aorT2")
    val aorT2: Double,
    @SerializedName("aort")
    val aort: Double,
    @SerializedName("aydusuk")
    val aydusuk: Double,
    @SerializedName("ayortalama")
    val ayortalama: Double,
    @SerializedName("ayyuksek")
    val ayyuksek: Double,
    @SerializedName("beta")
    val beta: Double,
    @SerializedName("donem")
    val donem: String,
    @SerializedName("dunkukapanis")
    val dunkukapanis: Double,
    @SerializedName("dusuK1")
    val dusuK1: Double,
    @SerializedName("dusuK2")
    val dusuK2: Double,
    @SerializedName("dusuk")
    val dusuk: Double,
    @SerializedName("fiyatadimi")
    val fiyatadimi: Double,
    @SerializedName("fiyatkaz")
    val fiyatkaz: Double,
    @SerializedName("hacimloT1")
    val hacimloT1: Int,
    @SerializedName("hacimloT2")
    val hacimloT2: Int,
    @SerializedName("hacimlot")
    val hacimlot: Int,
    @SerializedName("hacimtL1")
    val hacimtL1: Int,
    @SerializedName("hacimtL2")
    val hacimtL2: Int,
    @SerializedName("hacimtl")
    val hacimtl: Int,
    @SerializedName("hacimtldun")
    val hacimtldun: Int,
    @SerializedName("hacimyuzdedegisim")
    val hacimyuzdedegisim: Double,
    @SerializedName("haftadusuk")
    val haftadusuk: Double,
    @SerializedName("haftaortalama")
    val haftaortalama: Double,
    @SerializedName("haftayuksek")
    val haftayuksek: Double,
    @SerializedName("izafikapanis")
    val izafikapanis: Int,
    @SerializedName("kapaniS1")
    val kapaniS1: Double,
    @SerializedName("kapaniS2")
    val kapaniS2: Double,
    @SerializedName("kapanis")
    val kapanis: Double,
    @SerializedName("kapanisfark")
    val kapanisfark: Any,
    @SerializedName("kaykar")
    val kaykar: Int,
    @SerializedName("net")
    val net: Double,
    @SerializedName("netkar")
    val netkar: Long,
    @SerializedName("oncekiaykapanis")
    val oncekiaykapanis: Double,
    @SerializedName("oncekihaftakapanis")
    val oncekihaftakapanis: Double,
    @SerializedName("oncekikapanis")
    val oncekikapanis: Double,
    @SerializedName("oncekiyilkapanis")
    val oncekiyilkapanis: Double,
    @SerializedName("ozsermaye")
    val ozsermaye: Long,
    @SerializedName("piydeg")
    val piydeg: Double,
    @SerializedName("saklamaor")
    val saklamaor: Double,
    @SerializedName("satis")
    val satis: Double,
    @SerializedName("sektorid")
    val sektorid: Int,
    @SerializedName("sembol")
    val sembol: String,
    @SerializedName("sembolid")
    val sembolid: Int,
    @SerializedName("sermaye")
    val sermaye: Int,
    @SerializedName("taban")
    val taban: Double,
    @SerializedName("tarih")
    val tarih: String,
    @SerializedName("tavan")
    val tavan: Double,
    @SerializedName("xU100AG")
    val xU100AG: Double,
    @SerializedName("yildusuk")
    val yildusuk: Double,
    @SerializedName("yilortalama")
    val yilortalama: Double,
    @SerializedName("yilyuksek")
    val yilyuksek: Double,
    @SerializedName("yukseK1")
    val yukseK1: Double,
    @SerializedName("yukseK2")
    val yukseK2: Double,
    @SerializedName("yuksek")
    val yuksek: Double,
    @SerializedName("yuzdedegisim")
    val yuzdedegisim: Double,
    @SerializedName("yuzdedegisimS1")
    val yuzdedegisimS1: Double,
    @SerializedName("yuzdedegisimS2")
    val yuzdedegisimS2: Double
)