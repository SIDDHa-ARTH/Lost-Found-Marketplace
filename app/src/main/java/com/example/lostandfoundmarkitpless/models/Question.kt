package com.example.lostandfoundmarkitpless.models

data class Question(
    val id: String,
    val text: String,
    val imageUrl: String? = null
)