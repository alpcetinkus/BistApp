package com.example.bistapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bistapp.R

import com.example.bistapp.models.list.Data
import kotlinx.android.synthetic.main.home_rv_card.view.*

class BistListAdapter (private val bistlist: ArrayList<Data>)
    : RecyclerView.Adapter<BistListAdapter.CardDesign>(){

        class CardDesign(view: View) : RecyclerView.ViewHolder(view){

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesign {
        val design = LayoutInflater.from(parent.context).inflate(R.layout.home_rv_card, parent, false)
        return CardDesign(design)
    }

    override fun onBindViewHolder(holder: CardDesign, position: Int) {
        val data = bistlist[position]

        holder.itemView.card_ad.text = data.ad
        holder.itemView.card_kod.text = data.kod

    }

    override fun getItemCount(): Int {
        return bistlist.size
    }
}