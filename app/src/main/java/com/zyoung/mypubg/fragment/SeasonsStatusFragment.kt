package com.zyoung.mypubg.fragment

import android.app.Activity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.Spinner
import android.widget.Toast
import com.zyoung.mypubg.R
import com.zyoung.mypubg.activity.MainActivity
import com.zyoung.mypubg.match.SeasonsAdapter

/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
class SeasonsStatusFragment : BaseFragment() {
    lateinit var spinner: Spinner
    lateinit var btnSearch: Button
    lateinit var mRegion: String
    lateinit var rvSeasons: RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_seasons_status, container, false)
        spinner = view.findViewById(R.id.spinner_region)
        btnSearch = view.findViewById(R.id.btn_search)
        rvSeasons = view.findViewById(R.id.rv_seasons)
        btnSearch.setOnClickListener {
            Toast.makeText(mContext as MainActivity, "Check success !", Toast.LENGTH_SHORT).show()
            Thread({
                val list = ArrayList<String>()
                val seasons = mPubg.seasons(mRegion)
                seasons?.seasons?.forEach { it ->
                    list.add(it.id)
                }
                list.reverse()
                (mContext as Activity).runOnUiThread { (rvSeasons.adapter as SeasonsAdapter).setNewData(list) }
            }).start()
        }
        rvSeasons.layoutManager = LinearLayoutManager(mContext)
        val seasonsAdapter = SeasonsAdapter(R.layout.item_season, ArrayList(), mContext)
        rvSeasons.adapter = seasonsAdapter
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val regions = resources.getStringArray(R.array.regions)
                mRegion = regions[position]
            }
        }
        return view
    }

}