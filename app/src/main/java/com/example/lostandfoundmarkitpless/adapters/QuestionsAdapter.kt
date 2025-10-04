package com.example.lostandfoundmarkitpless.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lostandfoundmarkitpless.R
import com.example.lostandfoundmarkitpless.models.Question

class QuestionsAdapter(private val items: List<Question>) : RecyclerView.Adapter<QuestionsAdapter.VH>() {
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val text: TextView = view.findViewById(R.id.questionText)
        val btn: Button = view.findViewById(R.id.viewAnswerBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_questions, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val q = items[position]
        holder.text.text = q.text
        holder.btn.setOnClickListener {
            android.widget.Toast.makeText(holder.itemView.context, "Answer not available", android.widget.Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int = items.size
}
