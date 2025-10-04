package com.example.lostandfoundmarkitpless.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lostandfoundmarkitpless.R
import com.example.lostandfoundmarkitpless.activities.StudySetActivity
import com.example.lostandfoundmarkitpless.models.StudySet

class StudySetAdapter(private val items: List<StudySet>) : RecyclerView.Adapter<StudySetAdapter.VH>() {
    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.setTitle)
        val desc: TextView = view.findViewById(R.id.setDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_study_set, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val set = items[position]
        holder.title.text = set.title
        holder.desc.text = set.description
        holder.itemView.setOnClickListener {
            val ctx = it.context
            val i = Intent(ctx, StudySetActivity::class.java)
            i.putExtra("setId", set.id)
            ctx.startActivity(i)
        }
    }

    override fun getItemCount(): Int = items.size
}
