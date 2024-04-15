package com.example.mygit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NotesAdapter(private val notesList: ArrayList<Note>):
    RecyclerView.Adapter<NotesAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: NotesAdapter.ViewHolder, position: Int) {
        val item = notesList[position]
        holder.name.text = item.name
    }

    override fun getItemCount(): Int {
        return notesList.size
    }
    class ViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val name = view.findViewById<TextView>(R.id.text)
    }
}
