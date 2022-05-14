package com.bagicode.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bagicode.bwamov.R
import com.bagicode.bwamov.sign.SignInActivity

class OnboardingOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_one)
        val btn_home = findViewById<Button>(R.id.btn_home)
        btn_home.setOnClickListener{
            var intent = Intent(this@OnboardingOneActivity,OnboardingTwoActivity::class.java)
            startActivity(intent)
        }
        val btn_daftar = findViewById<Button>(R.id.btn_daftar)
        btn_daftar.setOnClickListener{
            finishAffinity()
            var intent = Intent(this@OnboardingOneActivity, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}