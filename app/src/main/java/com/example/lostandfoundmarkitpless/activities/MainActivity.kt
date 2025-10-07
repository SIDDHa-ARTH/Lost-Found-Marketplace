package com.example.lostandfoundmarkitpless

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lostandfoundmarkitpless.adapters.ItemAdapter
import com.example.lostandfoundmarkitpless.databinding.ActivityMainBinding
import com.example.lostandfoundmarkitpless.models.LostItem

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val allItems = listOf(
        LostItem("University ID Card", "Found near the library entrance. Belongs to Alex.", "ID Cards", "Found"),
        LostItem("Chemistry Textbook", "Lost in the science building. Title: Organic Chemistry, 7th Edition.", "Books", "Lost"),
        LostItem("Bose Headphones", "Found in the cafeteria. Black color, over-ear style.", "Gadgets", "Found"),
        LostItem("Luxury Pen Set", "Lost during seminar in Room 204.", "Stationery", "Lost")
    )

    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = ItemAdapter(allItems)
        binding.itemRecycler.layoutManager = LinearLayoutManager(this)
        binding.itemRecycler.adapter = adapter

        val searchBar = findViewById<EditText>(R.id.searchBar)
        searchBar.setOnEditorActionListener { _, _, _ ->
            val query = searchBar.text.toString().trim()
            val filtered = allItems.filter {
                it.title.contains(query, ignoreCase = true) ||
                        it.description.contains(query, ignoreCase = true)
            }
            adapter.updateList(filtered)
            true
        }

        // Filter buttons
        findViewById<Button>(R.id.btnAll).setOnClickListener { adapter.updateList(allItems) }
        findViewById<Button>(R.id.btnIDCards).setOnClickListener { filterByCategory("ID Cards") }
        findViewById<Button>(R.id.btnBooks).setOnClickListener { filterByCategory("Books") }
        findViewById<Button>(R.id.btnGadgets).setOnClickListener { filterByCategory("Gadgets") }
        findViewById<Button>(R.id.btnStationery).setOnClickListener { filterByCategory("Stationery") }
    }

    private fun filterByCategory(category: String) {
        val filtered = allItems.filter { it.category == category }
        adapter.updateList(filtered)
    }
}
