package com.aleapp.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.aleapp.swoosh.Model.Player
import com.aleapp.swoosh.R
import com.aleapp.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    fun onBegginerClick(view: View){
        ballerBtn.isChecked = false
        player.skill = "begginer"
    }

    fun onBallerClick(view: View){
        begginerBtn.isChecked = false
        player.skill = "baller"
    }

    fun onFinishClick(view: View){
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else{
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}
