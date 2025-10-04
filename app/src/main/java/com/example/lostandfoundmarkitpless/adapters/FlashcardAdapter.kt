package com.example.lostandfoundmarkitpless.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lostandfoundmarkitpless.R
import com.example.lostandfoundmarkitpless.models.Flashcard

class FlashcardAdapter(private val cards: List<Flashcard>) : RecyclerView.Adapter<FlashcardAdapter.VH>() {
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val q: TextView = view.findViewById(R.id.questionText)
        val a: TextView = view.findViewById(R.id.answerText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_flashcard, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val card = cards[position]
        holder.q.text = card.question
        holder.a.text = card.answer
        holder.q.setOnClickListener {
            holder.a.visibility = if (holder.a.visibility == View.GONE) View.VISIBLE else View.GONE
        }
    }

    override fun getItemCount(): Int = cards.size
}
