package com.zyoung.mypubg.fragment

import android.content.Context
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.BaseViewHolder
import com.zyoung.mypubg.R
import com.zyoung.mypubg.activity.MainActivity
import com.zyoung.mypubg.data.PlayerStatusBean
import com.zyoung.pubgkt.api.bean.PlayerSeasonBetaInfo
import com.zyoung.pubgkt.api.tools.L
import com.zyoung.pubgkt.api.bean.PlayerSeasonInfo


/**
 * Description :
 *
 * Author : zYoung
 *
 * Date :  2018/5/24 18:12
 */
class MineFragment : BaseFragment(), View.OnClickListener {
    lateinit var spinner: Spinner
    lateinit var spinnerGameMode: Spinner
    lateinit var tvLoading: TextView
    lateinit var btnSearch: Button
    lateinit var ll: LinearLayout
    lateinit var llSeason: LinearLayout
    lateinit var mSeason: String
    lateinit var rvStatus: RecyclerView
    lateinit var array: Array<String?>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater?.inflate(R.layout.fragment_mine, container, false)
        spinner = view.findViewById(R.id.spinner_seasons)
        btnSearch = view.findViewById(R.id.btn_search)
        tvLoading = view.findViewById(R.id.tv_loading)
        spinnerGameMode = view.findViewById(R.id.spinner_game_mode)
        rvStatus = view.findViewById(R.id.rv_status)
        ll = view.findViewById(R.id.ll)
        llSeason = view.findViewById(R.id.ll_season)
        rvStatus.layoutManager = LinearLayoutManager(mContext)
        rvStatus.adapter = MineAdapter(R.layout.item_player_status, ArrayList(), mContext)
        Thread {
            val seasons = mPubg.seasons((activity as MainActivity).getResgion())
            if (seasons != null) {
                val list = seasons.seasons
                list.reversed()
                array = arrayOfNulls(list.size)
                for (i in 0 until list.size) {
                    array[i] = list[i].id
                }
                val adapter = ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, array)
                (mContext as MainActivity).runOnUiThread {
                    spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                        override fun onNothingSelected(parent: AdapterView<*>?) {
                        }

                        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                            mSeason = array[position].toString()
                            L.e(mSeason)
                        }
                    }
                    spinner.adapter = adapter
                    tvLoading.visibility = View.GONE
                    ll.visibility = View.VISIBLE
                    btnSearch.setOnClickListener(this)
                }
            }
        }.start()

        return view
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_search -> {
                tvLoading.visibility = View.VISIBLE
                ll.visibility = View.GONE
                llSeason.visibility = View.GONE
                Thread {
                    val cxt = mContext as MainActivity
                    L.d("BUTTON")
                    val gameMode = arrayOf("duo", "duo-fpp", "solo", "solo-fpp", "squad", "squad-fpp")
                    val duo: ArrayList<PlayerStatusBean>
                    val duofpp: ArrayList<PlayerStatusBean>
                    val squad: ArrayList<PlayerStatusBean>
                    val squadfpp: ArrayList<PlayerStatusBean>
                    val solo: ArrayList<PlayerStatusBean>
                    val solofpp: ArrayList<PlayerStatusBean>
                    if (mSeason.contains("2017")) {
                        val playerSeason = mPubg.playerBetaSeason(cxt.getResgion(), cxt.getPlayer().id, mSeason)
                        duo = getPlayerBetaStatus(playerSeason!!.duo)
                        duofpp = getPlayerBetaStatus(playerSeason!!.duofpp)
                        squad = getPlayerBetaStatus(playerSeason!!.squad)
                        squadfpp = getPlayerBetaStatus(playerSeason!!.squadfpp)
                        solo = getPlayerBetaStatus(playerSeason!!.solo)
                        solofpp = getPlayerBetaStatus(playerSeason!!.solofpp)
                    } else {
                        val playerSeason = mPubg.playerSeason(cxt.getResgion(), cxt.getPlayer().id, mSeason)
                        duo = getPlayerStatus(playerSeason!!.duo)
                        duofpp = getPlayerStatus(playerSeason!!.duofpp)
                        squad = getPlayerStatus(playerSeason!!.squad)
                        squadfpp = getPlayerStatus(playerSeason!!.squadfpp)
                        solo = getPlayerStatus(playerSeason!!.solo)
                        solofpp = getPlayerStatus(playerSeason!!.solofpp)
                    }
                    cxt.runOnUiThread {
                        tvLoading.visibility = View.GONE
                        ll.visibility = View.VISIBLE
                        llSeason.visibility = View.VISIBLE

                        val adapter = ArrayAdapter<String>(mContext, android.R.layout.simple_list_item_1, gameMode)
                        spinnerGameMode.adapter = adapter
                        spinnerGameMode.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                            override fun onNothingSelected(parent: AdapterView<*>?) {
                            }

                            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                                var gameMode = gameMode[position]
                                when (gameMode) {
                                    "duo" -> {
                                        (rvStatus.adapter as MineAdapter).setNewData(duo)
                                    }
                                    "duo-fpp" -> {
                                        (rvStatus.adapter as MineAdapter).setNewData(duofpp)
                                    }
                                    "solo" -> {
                                        (rvStatus.adapter as MineAdapter).setNewData(solo)
                                    }
                                    "solo-fpp" -> {
                                        (rvStatus.adapter as MineAdapter).setNewData(solofpp)
                                    }
                                    "squad" -> {
                                        (rvStatus.adapter as MineAdapter).setNewData(squad)
                                    }
                                    "squad-fpp" -> {
                                        (rvStatus.adapter as MineAdapter).setNewData(squadfpp)
                                    }
                                }
                            }
                        }
                    }

                }.start()
            }
        }
    }

    private fun getPlayerStatus(bean: PlayerSeasonInfo.DataBeanXXXXX.AttributesBean.GameModeStatsBean.GameModeBean): ArrayList<PlayerStatusBean> {
        var list = ArrayList<PlayerStatusBean>()
        list.add(PlayerStatusBean("assists", bean.assists.toString()))
        list.add(PlayerStatusBean("boosts", bean.boosts.toString()))
        list.add(PlayerStatusBean("dbnOs", bean.dbnOs.toString()))
        list.add(PlayerStatusBean("dailyKills", bean.dailyKills.toString()))
        list.add(PlayerStatusBean("damageDealt", bean.damageDealt.toString()))
        list.add(PlayerStatusBean("days", bean.days.toString()))
        list.add(PlayerStatusBean("headshotKills", bean.headshotKills.toString()))
        list.add(PlayerStatusBean("heals", bean.heals.toString()))
        list.add(PlayerStatusBean("killPoints", bean.killPoints.toString()))
        list.add(PlayerStatusBean("kills", bean.kills.toString()))
        list.add(PlayerStatusBean("longestKill", bean.longestKill.toString()))
        list.add(PlayerStatusBean("longestTimeSurvived", bean.longestTimeSurvived.toString()))
        list.add(PlayerStatusBean("losses", bean.losses.toString()))
        list.add(PlayerStatusBean("maxKillStreaks", bean.maxKillStreaks.toString()))
        list.add(PlayerStatusBean("mostSurvivalTime", bean.mostSurvivalTime.toString()))
        list.add(PlayerStatusBean("revives", bean.revives.toString()))
        list.add(PlayerStatusBean("rideDistance", bean.rideDistance.toString()))
        list.add(PlayerStatusBean("roadKills", bean.roadKills.toString()))
        list.add(PlayerStatusBean("roundMostKills", bean.roundMostKills.toString()))
        list.add(PlayerStatusBean("roundsPlayed", bean.roundsPlayed.toString()))
        list.add(PlayerStatusBean("suicides", bean.suicides.toString()))
        list.add(PlayerStatusBean("teamKills", bean.teamKills.toString()))
        list.add(PlayerStatusBean("timeSurvived", bean.timeSurvived.toString()))
        list.add(PlayerStatusBean("top10s", bean.top10s.toString()))
        list.add(PlayerStatusBean("vehicleDestroys", bean.vehicleDestroys.toString()))
        list.add(PlayerStatusBean("walkDistance", bean.walkDistance.toString()))
        list.add(PlayerStatusBean("weaponsAcquired", bean.weaponsAcquired.toString()))
        list.add(PlayerStatusBean("weeklyKills", bean.weeklyKills.toString()))
        list.add(PlayerStatusBean("winPoints", bean.winPoints.toString()))
        list.add(PlayerStatusBean("wins", bean.wins.toString()))
        return list
    }

    private fun getPlayerBetaStatus(bean: PlayerSeasonBetaInfo.DataBeanXX.AttributesBean.GameModeStatsBean.GameModeBean): ArrayList<PlayerStatusBean> {
        var list = ArrayList<PlayerStatusBean>()
        list.add(PlayerStatusBean("assists", bean.assists.toString()))
        list.add(PlayerStatusBean("boosts", bean.boosts.toString()))
        list.add(PlayerStatusBean("dbnOs", bean.dbnOs.toString()))
        list.add(PlayerStatusBean("dailyKills", bean.dailyKills.toString()))
        list.add(PlayerStatusBean("damageDealt", bean.damageDealt.toString()))
        list.add(PlayerStatusBean("days", bean.days.toString()))
        list.add(PlayerStatusBean("headshotKills", bean.headshotKills.toString()))
        list.add(PlayerStatusBean("heals", bean.heals.toString()))
        list.add(PlayerStatusBean("killPoints", bean.killPoints.toString()))
        list.add(PlayerStatusBean("kills", bean.kills.toString()))
        list.add(PlayerStatusBean("longestKill", bean.longestKill.toString()))
        list.add(PlayerStatusBean("longestTimeSurvived", bean.longestTimeSurvived.toString()))
        list.add(PlayerStatusBean("losses", bean.losses.toString()))
        list.add(PlayerStatusBean("maxKillStreaks", bean.maxKillStreaks.toString()))
        list.add(PlayerStatusBean("mostSurvivalTime", bean.mostSurvivalTime.toString()))
        list.add(PlayerStatusBean("revives", bean.revives.toString()))
        list.add(PlayerStatusBean("rideDistance", bean.rideDistance.toString()))
        list.add(PlayerStatusBean("roadKills", bean.roadKills.toString()))
        list.add(PlayerStatusBean("roundMostKills", bean.roundMostKills.toString()))
        list.add(PlayerStatusBean("roundsPlayed", bean.roundsPlayed.toString()))
        list.add(PlayerStatusBean("suicides", bean.suicides.toString()))
        list.add(PlayerStatusBean("teamKills", bean.teamKills.toString()))
        list.add(PlayerStatusBean("timeSurvived", bean.timeSurvived.toString()))
        list.add(PlayerStatusBean("top10s", bean.top10s.toString()))
        list.add(PlayerStatusBean("vehicleDestroys", bean.vehicleDestroys.toString()))
        list.add(PlayerStatusBean("walkDistance", bean.walkDistance.toString()))
        list.add(PlayerStatusBean("weaponsAcquired", bean.weaponsAcquired.toString()))
        list.add(PlayerStatusBean("weeklyKills", bean.weeklyKills.toString()))
        list.add(PlayerStatusBean("winPoints", bean.winPoints.toString()))
        list.add(PlayerStatusBean("wins", bean.wins.toString()))
        return list
    }

}

class MineAdapter : BaseQuickAdapter<PlayerStatusBean, BaseViewHolder> {
    constructor(layoutResId: Int, data: MutableList<PlayerStatusBean>?, context: Context) : super(layoutResId, data) {
        mContext = context
    }

    override fun convert(holder: BaseViewHolder?, bean: PlayerStatusBean?) {
        holder?.setText(R.id.tv_tittle, bean?.title)
                ?.setText(R.id.tv_content, bean?.content)
    }

}