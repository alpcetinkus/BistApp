package com.example.bistapp

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.bistapp.model.api.RetrofitClient
import com.example.bistapp.model.detail.DetailModel
import kotlinx.android.synthetic.main.activity_detail.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.random.Random
import kotlin.text.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val bistKod = intent.extras?.getString("bistKod")
        fetchDetail(bistKod)

        val graphList = mutableListOf<Double>()
        val random = Random(1)

        for (i in 0..8) {
            graphList.add(random.nextDouble())
        }
        Log.e("alpppppp", graphList.toString())
        graphView.drawGraph(graphList)


        back.setOnClickListener {
            startActivity(Intent(this@DetailActivity,MainActivity::class.java))
        }
        newsPage.setOnClickListener {
            startActivity(Intent(this@DetailActivity,NewsActivity::class.java))
        }

    }


    fun fetchDetail(kod: String?) {

        kod?.let {
            RetrofitClient.getApiImplementation().getDetails(it).enqueue(object : Callback<DetailModel> {
                @SuppressLint("SetTextI18n")
                override fun onResponse(call: Call<DetailModel>?, response: Response<DetailModel>?) {

                    if (response != null) {
                        val resBody = response.body()
                        val piydegNumb: Double = resBody.data.hisseYuzeysel.piydeg
                        val scale = 1000000000.0
                        val scaledNumber = piydegNumb / scale
                        val formattedNumber = String.format("%.2f", scaledNumber)

                        openValue.text = resBody.data.hisseYuzeysel.acilis.toString()
                        highValue.text = resBody.data.hisseYuzeysel.yuksek.toString()
                        lowValue.text = resBody.data.hisseYuzeysel.dusuk.toString()
                        hacimValue.text = resBody.data.hisseYuzeysel.hacimyuzdedegisim.toString()
                        fkValue.text = resBody.data.hisseYuzeysel.fiyatkaz.toString()
                        degerValue.text = String.format(formattedNumber)
                        sembolText.text = resBody.data.hisseYuzeysel.sembol
                        aciklamaText.text = resBody.data.hisseYuzeysel.aciklama
                        satisText.text = resBody.data.hisseYuzeysel.satis.toString()
                        netText.text = resBody.data.hisseYuzeysel.net.toString()

                        if (resBody.data.hisseYuzeysel.net >= 0) {
                            netText.setTextColor(Color.GREEN)
                        } else if (resBody.data.hisseYuzeysel.net < 0) {
                            netText.setTextColor(Color.RED)
                        }
                        yearHighValue.text = resBody.data.hisseYuzeysel.yilyuksek.toString()
                        yearLowValue.text = resBody.data.hisseYuzeysel.yildusuk.toString()
                        ortHacimValue.text = String.format("%.2f",resBody.data.hisseYuzeysel.fiyatadimi)

                    } else {
                        fkValue.text = "-"
                        degerValue.text = "-"
                    }
                }

                override fun onFailure(call: Call<DetailModel>?, t: Throwable?) {

                    Log.e("alppppp", "Failed::" + (t))
                }
            })
        }
    }
}


