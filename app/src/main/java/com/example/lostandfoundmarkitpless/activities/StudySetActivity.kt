package com.example.lostandfoundmarkitpless.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lostandfoundmarkitpless.adapters.FlashcardAdapter

import com.example.lostandfoundmarkitpless.databinding.ActivityStudySetBinding

import com.example.lostandfoundmarkitpless.models.Flashcard

class StudySetActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStudySetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStudySetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cards = listOf(
            Flashcard("f1","What is an alkane?","A hydrocarbon with only single bonds."),
            Flashcard("f2","Name an example of an alkane","Methane (CH4)")
        )
        binding.flashcardsRecycler.layoutManager = LinearLayoutManager(this)
        binding.flashcardsRecycler.adapter = FlashcardAdapter(cards)
    }
}
