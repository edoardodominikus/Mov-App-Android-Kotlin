package com.bagicode.bwamov.sign

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bagicode.bwamov.R
import com.bagicode.bwamov.onboarding.OnboardingThreeActivity
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btn_login = findViewById<Button>(R.id.btn_login)
        btn_login.setOnClickListener{
            val database = Firebase.database("https://bwa-mov-421b2-default-rtdb.firebaseio.com/")
            val myRef = database.getReference("message")

            myRef.setValue("Hello, World!")
            var intent = Intent(this@SignInActivity,OnboardingThreeActivity::class.java)
            startActivity(intent)
        }
    }
}