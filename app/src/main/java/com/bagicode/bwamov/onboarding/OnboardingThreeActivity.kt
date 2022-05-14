package com.bagicode.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bagicode.bwamov.R
import com.bagicode.bwamov.sign.SignInActivity

class OnboardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_three)
        val btn_home = findViewById<Button>(R.id.btn_home)
        btn_home.setOnClickListener{
            finishAffinity()
            var intent = Intent(this@OnboardingThreeActivity,SignInActivity::class.java)
            startActivity(intent)
        }
    }
}