package com.example.lostandfoundmarkitpless.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lostandfoundmarkitpless.R
import com.example.lostandfoundmarkitpless.models.LostItem

class ItemAdapter(var items: List<LostItem>) : RecyclerView.Adapter<ItemAdapter.VH>() {

    class VH(view: View) : RecyclerView.ViewHolder(view) {
        val title: TextView = view.findViewById(R.id.itemTitle)
        val desc: TextView = view.findViewById(R.id.itemDesc)
        val category: TextView = view.findViewById(R.id.itemCategory)
        val status: TextView = view.findViewById(R.id.itemStatus)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        holder.title.text = item.title
        holder.desc.text = item.description
        holder.category.text = "Category: ${item.category}"
        holder.status.text = item.status
    }

    override fun getItemCount(): Int = items.size
    fun updateList(newList: List<LostItem>) {
        items = newList
        notifyDataSetChanged()
    }

}