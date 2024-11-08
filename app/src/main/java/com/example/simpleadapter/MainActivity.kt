package com.example.simpleadapter

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val infos = listOf(
            mapOf("name" to "samira", "age" to "25"),
            mapOf("name" to "jamal", "age" to "30"),
            mapOf("name" to "amine", "age" to "28")
        )
        val key = arrayOf("name", "age")

        val v  = intArrayOf(R.id.nameTextView, R.id.ageTextView)
        val adapter = SimpleAdapter(this, infos, R.layout.list_row_items, key, v)
        val listView: ListView = findViewById(R.id.listView)
        listView.adapter = adapter


    }
}