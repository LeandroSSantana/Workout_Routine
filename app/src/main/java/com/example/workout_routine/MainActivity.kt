package com.example.workout_routine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.workout_routine.adapter.RoutineAdapter
import com.example.workout_routine.data.FakeRoutineData

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val routinesRecyclerView = findViewById<RecyclerView>(R.id.routinesRecyclerView)
        val selectedRoutineTextView = findViewById<TextView>(R.id.selectedRoutineTextView)

        val adapter = RoutineAdapter(FakeRoutineData.routines) { routine ->
            selectedRoutineTextView.text = routine.name
        }

        routinesRecyclerView.adapter = adapter
        routinesRecyclerView.layoutManager = LinearLayoutManager(this)
    }
}