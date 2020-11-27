package com.sopt.publyclone.ui

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import com.sopt.publyclone.R



class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

    //moved?????
        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)


    }
}