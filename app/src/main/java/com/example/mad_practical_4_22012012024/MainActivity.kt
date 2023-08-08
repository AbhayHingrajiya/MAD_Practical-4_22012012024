package com.example.mad_practical_4_22012012024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val login:Button=findViewById(R.id.Login)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        login.setOnClickListener {
            Intent(this@MainActivity,LoginActivity::class.java).also { startActivity(it) }
        }
    }
}