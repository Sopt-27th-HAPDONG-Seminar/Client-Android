package com.sopt.publyclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.publyclone.R
import com.sopt.publyclone.model.Home_Article_Data
import com.sopt.publyclone.model.Home_Story_Data

class Home_Article_RecyclerViewAdapter(private val context : Context) : RecyclerView.Adapter<Home_Article_RecyclerViewHolder>() {
    var data2 = mutableListOf<Home_Article_Data>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Home_Article_RecyclerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.home_feed_item_list, parent, false)
        return Home_Article_RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: Home_Article_RecyclerViewHolder, position: Int) {
        holder.onBind((data2[position]))
    }

    override fun getItemCount(): Int = data2.size
}