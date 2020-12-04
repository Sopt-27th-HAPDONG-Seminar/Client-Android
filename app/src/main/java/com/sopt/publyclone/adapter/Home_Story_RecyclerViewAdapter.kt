package com.sopt.publyclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sopt.publyclone.R
import com.sopt.publyclone.model.Home_Story_Data

class Home_Story_RecyclerViewAdapter (private val context : Context) : RecyclerView.Adapter<Home_Story_RecyclerViewHolder>() {

    var data1 = mutableListOf<Home_Story_Data>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Home_Story_RecyclerViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.home_story_item_list, parent, false)
        return Home_Story_RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: Home_Story_RecyclerViewHolder, position: Int) {
        holder.onBind((data1[position]))
    }

    override fun getItemCount(): Int = data1.size
}
