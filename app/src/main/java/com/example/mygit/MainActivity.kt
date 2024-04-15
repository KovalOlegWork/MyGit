package com.example.mygit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var notesList: ArrayList<Note>
    private lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        notesList = arrayListOf<Note>()
        getUserData()
    }
    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
    }
    private fun getUserData(){
        for (i in 1 .. 15){
            val notes = Note("Note $i")
            notesList.add(notes)
        }
        recyclerView.adapter = NotesAdapter(notesList)
    }
}