package com.example.lostandfoundmarkitpless.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.lostandfoundmarkitpless.adapters.QuestionsAdapter
import com.example.lostandfoundmarkitpless.databinding.ActivityQuestionsBinding
import com.example.lostandfoundmarkitpless.models.Question


class QuestionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuestionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val dummy = listOf(
            Question("q1","What is the difference between an alkene and an alkyne?"),
            Question("q2","How do I solve this integral?")
        )
        binding.questionsRecycler.layoutManager = LinearLayoutManager(this)
        binding.questionsRecycler.adapter = QuestionsAdapter(dummy)
    }
}
