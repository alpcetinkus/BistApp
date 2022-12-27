package com.example.bistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.bistapp.adapter.BistListAdapter
import com.example.bistapp.models.list.BistModel
import com.example.bistapp.models.list.Data
import com.example.bistapp.models.api.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var bistList: ArrayList<Data>
    private lateinit var bistListAdapter: BistListAdapter
    private lateinit var home_rv: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        home_rv = findViewById(R.id.home_rv)
        home_rv.setHasFixedSize(true)
        home_rv.layoutManager = StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.VERTICAL)
        bistList = ArrayList()

        bistListAdapter = BistListAdapter(bistList)
        home_rv.adapter = bistListAdapter

        fetchBistList()
    }



    fun fetchBistList() {

        RetrofitClient.getApiImplementation().getBistList().enqueue(object : Callback<BistModel> {
            override fun onResponse(call: Call<BistModel>?, response: Response<BistModel>?) {
                if (response != null) {
                    val responseBody = response.body()
                    if (responseBody != null) {
                        for (coin in responseBody.data) {
                            bistList.add(Data(coin.ad, coin.kod))
                        }
                    }
                }
                bistListAdapter.notifyDataSetChanged()
            }

            override fun onFailure(call: Call<BistModel>?, t: Throwable?) {
                Log.e("alppppp", "Failed::" + (t))
            }
        })
    }





}