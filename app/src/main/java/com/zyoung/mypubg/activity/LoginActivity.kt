package com.zyoung.mypubg.activity

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Toast
import com.google.gson.Gson
import com.zyoung.mypubg.APP_KEY
import com.zyoung.mypubg.R
import com.zyoung.pubgkt.api.Pubg
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mGson: Gson
    lateinit var mPubg: Pubg
    lateinit var mRegion: String
    lateinit var mContext: Context
    lateinit var mPlayerName: String
    var isSearching: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        mContext = this
        mPubg = Pubg(APP_KEY)
        mGson = Gson()

        btn_search.setOnClickListener(this)
        edt_playerName.setText("xTongBB")
        spinner_region.onItemSelectedListener = object : OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val regions = resources.getStringArray(R.array.regions)
                mRegion = regions[position]
            }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_search -> {
                if (isSearching == false) {
                    isSearching = true
                    Thread(Runnable {
                        mPlayerName = edt_playerName.text.toString()
                        if (mPlayerName.isEmpty()) {
                            Toast.makeText(mContext, "Player name must not empty !", Toast.LENGTH_SHORT).show()
                        } else {
                            val player = mPubg.player(mRegion, mPlayerName)
                            val json = mGson.toJson(player?.bean)
//                        Logger.json(json)
                            val intent = Intent(mContext, MainActivity::class.java)
                            intent.putExtra("player", mGson.toJson(player))
                            isSearching = false
                            mContext.startActivity(intent)
//                        finish()
                        }
                    }).start()
                } else {
                    Toast.makeText(mContext, "Searching player..", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

}