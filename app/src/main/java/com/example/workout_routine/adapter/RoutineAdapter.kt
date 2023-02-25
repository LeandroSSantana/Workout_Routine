package com.example.workout_routine.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.workout_routine.R
import com.example.workout_routine.model.Routine

class RoutineAdapter(private val routines: List<Routine>, private val onRoutineSelected: (Routine) -> Unit) :
    RecyclerView.Adapter<RoutineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.routine_item, parent, false)
        return RoutineViewHolder(view)
    }

    override fun getItemCount() = routines.size

    override fun onBindViewHolder(holder: RoutineViewHolder, position: Int) {
        val routine = routines[position]
        holder.bind(routine, onRoutineSelected)
    }
}

class RoutineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(routine: Routine, onRoutineSelected: (Routine) -> Unit) {
        itemView.routineNameTextView.text = routine.name
        itemView.routineDurationTextView.text = "${routine.duration} minutos"
        itemView.setOnClickListener { onRoutineSelected(routine) }
    }
}