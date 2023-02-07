package com.example.bistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
//        val db = Firebase.firestore
//
//        db.collection("pdfs")
//            .get()
//            .addOnSuccessListener { result ->
//                for (document in result) {
//                    Log.e("TAG", "${document.id} => ${document.data}")
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.e("TAG", "Error getting documents.", exception)
//            }
    }

}