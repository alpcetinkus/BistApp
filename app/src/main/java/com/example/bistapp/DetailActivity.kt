package com.example.bistapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.bistapp.models.api.RetrofitClient
import com.example.bistapp.models.detail.DetailModel
import kotlinx.android.synthetic.main.activity_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.random.Random

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val bistKod = intent.extras?.getString("bistKod")
        fetchDetail(bistKod)

        val grafikListesi = mutableListOf<Double>()
        val randomcu = Random(1)

        for (i in 0..100) {
            grafikListesi.add(randomcu.nextDouble())
        }
        Log.e("alpppppp",grafikListesi.toString())
        graphView.drawGraph(grafikListesi)

//        val grafikListesi = (listOf())
//        val top = grafikListesi.dataSet.maxOf {
//            it.close
//        }
//        val bottom = grafikListesi.dataSet.minOf {
//            it.close
//        }
//        val manup = grafikListesi.dataSet.map {
//            (it.close - bottom) / (top - bottom)
//        }
//
//        alpv.drawGraph(manup)

    }


    fun fetchDetail(kod: String?) {

        kod?.let {
            RetrofitClient.getApiImplementation().getDetails(it).enqueue(object : Callback<DetailModel> {
                @SuppressLint("SetTextI18n")
                override fun onResponse(call: Call<DetailModel>?, response: Response<DetailModel>?) {

                    if (response != null) {
                        var resBody = response.body()
                        detay.text = resBody.data.hisseYuzeysel.sembol
                    }
                }

                override fun onFailure(call: Call<DetailModel>?, t: Throwable?) {

                    Log.e("alppppp", "Failed::" + (t))
                }
            })
        }


    }

}


