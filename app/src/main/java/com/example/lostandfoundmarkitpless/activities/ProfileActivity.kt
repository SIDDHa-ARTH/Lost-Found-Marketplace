package com.example.lostandfoundmarkitpless.activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.lostandfoundmarkitpless.R

import com.example.lostandfoundmarkitpless.MainActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val qBtn = findViewById<Button>(R.id.yourQuestionsBtn)
        val sBtn = findViewById<Button>(R.id.yourSetsBtn)
        val setBtn = findViewById<Button>(R.id.settingsBtn)

        qBtn.setOnClickListener { startActivity(Intent(this, QuestionsActivity::class.java)) }
        sBtn.setOnClickListener { startActivity(Intent(this,  MainActivity::class.java)) }
    }
}
