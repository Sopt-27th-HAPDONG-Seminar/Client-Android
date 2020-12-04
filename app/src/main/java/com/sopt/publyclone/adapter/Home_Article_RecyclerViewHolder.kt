package com.sopt.publyclone.adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sopt.publyclone.R
import com.sopt.publyclone.model.Home_Article_Data

class Home_Article_RecyclerViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val profile_name : TextView = itemView.findViewById(R.id.txt_name)
    private val profile_profession : TextView = itemView.findViewById(R.id.txt_profession)
    private val profile_time : TextView = itemView.findViewById(R.id.txt_time)
    private val comment_title : TextView = itemView.findViewById(R.id.txt_title)
    private val comment_body : TextView = itemView.findViewById(R.id.txt_body)
    private val article_title : TextView = itemView.findViewById(R.id.txt_subtitle)
    private val article_company : TextView = itemView.findViewById(R.id.txt_company)

    fun onBind(data: Home_Article_Data) {
        profile_name.text = data.profile_name
        profile_profession.text = data.profile_profession
        profile_time.text = data.profile_time
        comment_title.text = data.comment_title
        comment_body.text = data.comment_body
        article_title.text = data.article_title
        article_company.text = data.article_company
    }
}