package com.zyoung.mypubg.activity

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import com.zyoung.mypubg.APP_KEY
import com.zyoung.mypubg.R
import com.zyoung.mypubg.fragment.MatchesFragment
import com.zyoung.mypubg.fragment.MineFragment
import com.zyoung.mypubg.fragment.SeasonsStatusFragment
import com.zyoung.mypubg.fragment.VersionFragment
import com.zyoung.pubgkt.api.Pubg
import com.zyoung.pubgkt.api.wrapper.Player
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mGson: Gson
    lateinit var mPubg: Pubg
    lateinit var mContext: Context
    lateinit var mPlayer: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initListener()
    }

    private fun initListener() {
        tv_matches.setOnClickListener(this)
        tv_mine.setOnClickListener(this)
        tv_version.setOnClickListener(this)
        tv_seasons_status.setOnClickListener(this)
    }

    private fun initView() {
        setContentView(R.layout.activity_main)
        val fragments: List<Fragment> = listOf<Fragment>(MineFragment(), MatchesFragment(), SeasonsStatusFragment(), VersionFragment())
        val fragmentAdapter = MyFragmentAdapter(supportFragmentManager, fragments)
        vp_main.adapter = fragmentAdapter
        vp_main.offscreenPageLimit = 4
        mContext = this
        mPubg = Pubg(APP_KEY)
        mGson = Gson()
        Toast.makeText(mContext, "Login success !", Toast.LENGTH_SHORT).show()
        val json = intent.extras.getString("player")
        mPlayer = mGson.fromJson<Player>(json, Player::class.java)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_mine -> {
                vp_main.setCurrentItem(0, false)
            }
            R.id.tv_matches -> {
                vp_main.setCurrentItem(1, false)
            }
            R.id.tv_seasons_status -> {
                vp_main.setCurrentItem(2, false)
            }
            R.id.tv_version -> {
                vp_main.setCurrentItem(3, false)
            }
        }
    }

    fun getPlayer(): Player {
        return mPlayer
    }

    fun getResgion():String{
        return mPlayer.shareId
    }

    class MyFragmentAdapter(fragmentManager: FragmentManager, list: List<Fragment>) : FragmentPagerAdapter(fragmentManager) {
        var list: List<Fragment>? = list

        override fun getItem(position: Int): Fragment {
            return list!![position]
        }

        override fun getCount(): Int {
            return list!!.size
        }

    }

}