package com.example.mad_practical_4_22012012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signUp: Button =findViewById(R.id.buttonSignUp)
        signUp.setOnClickListener {
            Intent(this@LoginActivity,RegistrationActivity::class.java).also { startActivity(it) }
        }
    }
}