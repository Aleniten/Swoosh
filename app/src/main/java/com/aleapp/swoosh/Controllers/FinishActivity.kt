package com.aleapp.swoosh.Controllers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.aleapp.swoosh.Model.Player
import com.aleapp.swoosh.R
import com.aleapp.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        looking.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
