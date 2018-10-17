package com.aleapp.swoosh.Controllers

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.aleapp.swoosh.Utilities.EXTRA_LEAGUE
import com.aleapp.swoosh.R
import com.aleapp.swoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun onBegginerClick(view: View){
        ballerBtn.isChecked = false
        skill = "begginer"
    }

    fun onBallerClick(view: View){
        begginerBtn.isChecked = false
        skill = "baller"
    }

    fun onFinishClick(view: View){
        if (skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)
        } else{
            Toast.makeText(this, "Please select a skill level.", Toast.LENGTH_SHORT).show()
        }

    }
}
