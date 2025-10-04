package com.example.lostandfoundmarkitpless.activities

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.lostandfoundmarkitpless.R

class RequestHelpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_help)

        val questionInput = findViewById<EditText>(R.id.requestQuestion)
        val submitBtn = findViewById<Button>(R.id.submitRequest)

        submitBtn.setOnClickListener {
            val q = questionInput.text.toString().trim()
            if (q.isEmpty()) {
                Toast.makeText(this, "Enter a question", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Request submitted", Toast.LENGTH_SHORT).show()
                questionInput.text.clear()
            }
        }
    }
}
