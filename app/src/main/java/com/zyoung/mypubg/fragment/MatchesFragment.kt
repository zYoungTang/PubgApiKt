package com.zyoung.mypubg.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zyoung.mypubg.R

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
class MatchesFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_matches, container, false)
        return view
    }
}