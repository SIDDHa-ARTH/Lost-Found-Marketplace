package com.example.lostandfoundmarkitpless.models

data class LostItem(
    val title: String,
    val description: String,
    val category: String,
    val status: String // "Lost" or "Found"
)
