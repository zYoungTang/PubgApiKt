package com.zyoung.mypubg.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.zyoung.mypubg.APP_KEY
import com.zyoung.mypubg.R
import com.zyoung.mypubg.activity.MainActivity
import com.zyoung.mypubg.match.MatchAdapter
import com.zyoung.pubgkt.api.Pubg
import com.zyoung.pubgkt.api.tools.L
import com.zyoung.pubgkt.api.wrapper.Match
import com.zyoung.pubgkt.api.wrapper.Player
import kotlinx.android.synthetic.main.fragment_matches.*

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
class MatchesFragment : Fragment() {
    lateinit var player: Player

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_matches, container, false)
        val gson = Gson()
        val pubg = Pubg(APP_KEY)
        L.d("MatchesFragment: ${gson.toJson(player)}")

        if (player != null) {
            Thread(Runnable {
                val matches = player!!.matches
                var list = ArrayList<Match>()
                matches.forEach { it ->
                    val match = pubg.getMatch(player!!.shareId, it.id)
                    list.add(match)
                    L.d("${match.matchInfo.data.attributes.createdAt} mode: ${match.matchInfo.data.attributes.gameMode}")
                }
                L.e("stop")
                val adapter = MatchAdapter(R.layout.item_match, list, (activity as MainActivity).mContext)
                val layoutManager = LinearLayoutManager(activity)
                rv_matches.post({
                    tv_content.visibility = View.GONE
                    rv_matches.layoutManager = layoutManager
                    rv_matches.adapter = adapter
                })
            }).start()

        } else {
            L.e("player == null ")
        }
        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        player = (activity as MainActivity).getPlayer()
    }
}