package com.bagicode.bwamov.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.bagicode.bwamov.R

class OnboardingTwoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_two)
        val btn_home = findViewById<Button>(R.id.btn_home)
        btn_home.setOnClickListener{
            var intent = Intent(this@OnboardingTwoActivity,OnboardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}