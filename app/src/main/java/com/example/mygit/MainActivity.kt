package com.example.mygit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<Note>
    private lateinit var text: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        recyclerView.layoutManager = LinearLayoutManager(this)
        newArrayList = arrayListOf<Note>()

    }
    fun init(){
        recyclerView = findViewById(R.id.recyclerView)
    }
}