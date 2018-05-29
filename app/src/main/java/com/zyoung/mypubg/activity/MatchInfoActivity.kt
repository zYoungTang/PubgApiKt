package com.zyoung.mypubg.activity

import android.content.Context
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.*
import com.google.gson.Gson
import com.zyoung.mypubg.R
import com.zyoung.mypubg.data.PlayerStatusBean
import com.zyoung.mypubg.match.AllPlayersAdapter
import com.zyoung.mypubg.match.PlayerStatusAdapter
import com.zyoung.pubgkt.api.bean.MatchInfo
import com.zyoung.pubgkt.api.tools.L
import com.zyoung.pubgkt.api.wrapper.Match
import kotlinx.android.synthetic.main.activity_match_info.*
import com.zyoung.pubgkt.api.bean.MatchInfo.IncludedBean.AttributesBeanX.StatsBean as StatsBean

class MatchInfoActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var mContext: Context
    private lateinit var ll: LinearLayout
    private lateinit var myPlayer: MatchInfo.IncludedBean
    private lateinit var participants: List<MatchInfo.IncludedBean>
    private lateinit var btnAllPlayers: Button
    private lateinit var btnMyPlayer: Button
    private lateinit var btnBack: Button
    private lateinit var llPlayerStatus: LinearLayout
    private lateinit var rvAllPlayers: RecyclerView
    private lateinit var rvStatus: RecyclerView
    private lateinit var gameMode: String
    private lateinit var createdAt: String
    private lateinit var tvTime: TextView
    private lateinit var tvGameMode: TextView
    private lateinit var tvRegion: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()

        mContext = this
        val gson = Gson()
        val playerStatus = intent.extras.getString("data")
        var matchInfo = gson.fromJson(playerStatus, Match::class.java)
        myPlayer = matchInfo.getPlayerStatus()
        participants = matchInfo.getParticipants()

        // 初始化界面
        getPlayerStatus(myPlayer)
        gameMode = matchInfo.matchInfo.data.attributes.gameMode
        createdAt = matchInfo.matchInfo.data.attributes.createdAt
        tvTime.text = createdAt
        tvGameMode.text = gameMode

        // 初始化 RecyclerView
        rvAllPlayers.layoutManager = LinearLayoutManager(this)
        val adapter = AllPlayersAdapter(R.layout.item_all_player, ArrayList(participants), object : AllPlayersAdapter.onSpecificPlayerListener {
            override fun onClick(bean: MatchInfo.IncludedBean?) {
                (rv_status.adapter as PlayerStatusAdapter).setNewData(getPlayerStatus(bean!!))
                llPlayerStatus.visibility = View.VISIBLE
                rvAllPlayers.visibility = View.GONE
                rv_status.scrollToPosition(0)
            }
        }, mContext)
        rvAllPlayers.adapter = adapter


        val statusAdapter = PlayerStatusAdapter(R.layout.item_player_status, getPlayerStatus(myPlayer), mContext)
        rv_status.layoutManager = LinearLayoutManager(mContext)
        rv_status.adapter = statusAdapter

        L.e("From MatchInfoActivity: $playerStatus")
    }

    private fun initView() {
        setContentView(R.layout.activity_match_info)
        btnBack = findViewById(R.id.btn_back)
        btnAllPlayers = findViewById(R.id.btn_all_players)
        btnMyPlayer = findViewById(R.id.btn_my_player)
        rvAllPlayers = findViewById(R.id.rv_all_players)
        llPlayerStatus = findViewById(R.id.ll_player_status)
        tvRegion = findViewById(R.id.tv_region)
        tvTime = findViewById(R.id.tv_time)
        tvGameMode = findViewById(R.id.tv_gamemode)
        rvStatus = findViewById(R.id.rv_status)
        btnBack.setOnClickListener(this)
        btnAllPlayers.setOnClickListener(this)
        btnMyPlayer.setOnClickListener(this)
        llPlayerStatus.visibility = View.VISIBLE
        rvAllPlayers.visibility = View.GONE
    }

    private fun getPlayerStatus(player: MatchInfo.IncludedBean): ArrayList<PlayerStatusBean> {
        var bean = player.attributes.stats
        tvRegion.text = player.shardId()
        var parent = LinearLayout(mContext)
        parent.layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT)
        parent.orientation = LinearLayout.VERTICAL

        var list = ArrayList<PlayerStatusBean>()
        list.add(PlayerStatusBean("name", bean.name))
        list.add(PlayerStatusBean("dbnOs", bean.dbnOs.toString()))
        list.add(PlayerStatusBean("assists", bean.assists.toString()))
        list.add(PlayerStatusBean("boosts", bean.boosts.toString()))
        list.add(PlayerStatusBean("damageDealt", bean.damageDealt.toString()))
        list.add(PlayerStatusBean("deathType", bean.deathType))
        list.add(PlayerStatusBean("headshotKills", bean.headshotKills.toString()))
        list.add(PlayerStatusBean("heals", bean.heals.toString()))
        list.add(PlayerStatusBean("killPlace", bean.killPlace.toString()))
        list.add(PlayerStatusBean("killPoints", bean.killPoints.toString()))
        list.add(PlayerStatusBean("killPointsDelta", bean.killPointsDelta.toString()))
        list.add(PlayerStatusBean("killStreaks", bean.killStreaks.toString()))
        list.add(PlayerStatusBean("kills", bean.kills.toString()))
        list.add(PlayerStatusBean("lastKillPoints", bean.lastKillPoints.toString()))
        list.add(PlayerStatusBean("lastWinPoints", bean.lastWinPoints.toString()))
        list.add(PlayerStatusBean("longestKill", bean.longestKill.toString()))
        list.add(PlayerStatusBean("mostDamage", bean.mostDamage.toString()))
        list.add(PlayerStatusBean("revives", bean.revives.toString()))
        list.add(PlayerStatusBean("rideDistance", bean.rideDistance.toString()))
        list.add(PlayerStatusBean("roadKills", bean.roadKills.toString()))
        list.add(PlayerStatusBean("teamKills", bean.teamKills.toString()))
        list.add(PlayerStatusBean("timeSurvived", bean.timeSurvived.toString()))
        list.add(PlayerStatusBean("vehicleDestroys", bean.vehicleDestroys.toString()))
        list.add(PlayerStatusBean("walkDistance", bean.walkDistance.toString()))
        list.add(PlayerStatusBean("weaponsAcquired", bean.weaponsAcquired.toString()))
        list.add(PlayerStatusBean("winPlace", bean.winPlace.toString()))
        list.add(PlayerStatusBean("winPoints", bean.winPoints.toString()))
        list.add(PlayerStatusBean("winPointsDelta", bean.winPointsDelta.toString()))
        return list
    }

    override fun onClick(v: View?) {
        when (v?.id) {
        // 退出 Activity
            R.id.btn_back -> {
                finish()
            }
        // 显示这盘比赛所有玩家名字
            R.id.btn_all_players -> {
                llPlayerStatus.visibility = View.GONE
                rvAllPlayers.visibility = View.VISIBLE
                rvAllPlayers.smoothScrollToPosition(0)
            }
        // 查看 myPlayer 的比赛信息
            R.id.btn_my_player -> {
                Toast.makeText(mContext, "Current player: ${myPlayer.name()}", Toast.LENGTH_SHORT).show()
                getPlayerStatus(myPlayer)
                (rv_status.adapter as PlayerStatusAdapter).setNewData(getPlayerStatus(myPlayer))
                llPlayerStatus.visibility = View.VISIBLE
                rvAllPlayers.visibility = View.GONE
                rv_status.scrollToPosition(0)
            }
        }
    }

}
