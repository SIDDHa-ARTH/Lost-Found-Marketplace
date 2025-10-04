package com.example.lostandfoundmarkitpless.models

data class StudySet(
    val id: String,
    val title: String,
    val description: String,
    val cards: List<Flashcard>
)