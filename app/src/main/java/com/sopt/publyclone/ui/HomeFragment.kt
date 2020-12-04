package com.sopt.publyclone.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.sopt.publyclone.R
import com.sopt.publyclone.adapter.Home_Article_RecyclerViewAdapter
import com.sopt.publyclone.adapter.Home_Story_RecyclerViewAdapter
import com.sopt.publyclone.model.Home_Article_Data
import com.sopt.publyclone.model.Home_Story_Data
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.home_story_item_list.*


class HomeFragment : Fragment() {
    private lateinit var home_story_rcv_adapter:Home_Story_RecyclerViewAdapter
    private lateinit var home_article_rcv_adapter:Home_Article_RecyclerViewAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        home_story_rcv_adapter = Home_Story_RecyclerViewAdapter(context as MainActivity)
        home_story_rcv.adapter = home_story_rcv_adapter

        home_article_rcv_adapter = Home_Article_RecyclerViewAdapter(context as MainActivity)
        home_feed_rcv.adapter = home_article_rcv_adapter

        val lm1 = LinearLayoutManager(context as MainActivity)
        home_story_rcv.layoutManager = lm1
        lm1.orientation = LinearLayoutManager.HORIZONTAL;

        home_story_rcv_adapter.data1 = mutableListOf(
            Home_Story_Data("제목"),
            Home_Story_Data("제목")
        )

        home_story_rcv_adapter.notifyDataSetChanged()

        val lm2 = LinearLayoutManager(context as MainActivity)
        home_feed_rcv.layoutManager = lm2
        lm2.orientation = LinearLayoutManager.VERTICAL

        home_article_rcv_adapter.data2 = mutableListOf(
            Home_Article_Data("홍길동", "큐레이터의 직업", "7시간 전", "큐레이터의코멘트제목두줄까지들어갑니다큐레이터의코멘트제목두줄까지들어갑니다큐레이터의코멘트", "큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네...", "기사의제목입니다총두줄들어갑니다기사의제목입니다총두줄들어갑니다기사의제목입니다총두줄들어갑", "안드신문"),
            Home_Article_Data("홍길동", "큐레이터의 직업", "7시간 전", "큐레이터의코멘트제목두줄까지들어갑니다큐레이터의코멘트제목두줄까지들어갑니다큐레이터의코멘트", "큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네...", "기사의제목입니다총두줄들어갑니다기사의제목입니다총두줄들어갑니다기사의제목입니다총두줄들어갑", "안드신문"),
            Home_Article_Data("홍길동", "큐레이터의 직업", "7시간 전", "큐레이터의코멘트제목두줄까지들어갑니다큐레이터의코멘트제목두줄까지들어갑니다큐레이터의코멘트", "큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네줄까지들어갑니다큐레이터의코멘트본문네...", "기사의제목입니다총두줄들어갑니다기사의제목입니다총두줄들어갑니다기사의제목입니다총두줄들어갑", "안드신문"),
        )
        home_article_rcv_adapter.notifyDataSetChanged()
    }
}