package com.example.lostandfoundmarkitpless.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lostandfoundmarkitpless.adapters.StudySetAdapter
import com.example.lostandfoundmarkitpless.databinding.ActivityMainBinding // 1. Import the binding class
import com.example.lostandfoundmarkitpless.models.Flashcard
import com.example.lostandfoundmarkitpless.models.StudySet

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // 2. Create a binding variable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // 3. Inflate the layout
        setContentView(binding.root) // 4. Set the content view to the binding's root

        val dummy = listOf(
            StudySet("1","Organic Chemistry Basics","Intro to alkanes", listOf(
                Flashcard("f1","What is an alkane?","A hydrocarbon with only single bonds."),
                Flashcard("f2","General formula for alkanes?","CnH2n+2")
            )),
            StudySet("2","Physics Equations","Important formulas", emptyList())
        )

        // 5. Access views through the binding object
        binding.studySetsRecycler.layoutManager = LinearLayoutManager(this)
        binding.studySetsRecycler.adapter = StudySetAdapter(dummy)
    }
}
