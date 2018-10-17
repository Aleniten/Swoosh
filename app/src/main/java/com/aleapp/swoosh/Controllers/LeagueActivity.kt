package com.aleapp.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.aleapp.swoosh.Model.Player
import com.aleapp.swoosh.R
import com.aleapp.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player ("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        mensBtn.isChecked = false
        womensBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View){
        if (player.league != ""){
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
                Toast.makeText(this, "Please Select a League.", Toast.LENGTH_SHORT ).show()
            }
        }
    }
