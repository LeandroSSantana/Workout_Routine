package com.example.workout_routine.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.workout_routine.R
import com.example.workout_routine.model.Routine

class RoutineAdapter(
    private val routines: List<Routine>,
    private val onItemClick: (Routine) -> Unit
) : RecyclerView.Adapter<RoutineAdapter.RoutineViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoutineViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.routine_item, parent, false)
        return RoutineViewHolder(view)
    }

    override fun getItemCount(): Int = routines.size

    override fun onBindViewHolder(holder: RoutineViewHolder, position: Int) {
        val routine = routines[position]
        holder.bind(routine)
        holder.itemView.setOnClickListener { onItemClick(routine) }
    }

    inner class RoutineViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val routineImageView: ImageView = itemView.findViewById(R.id.routineImageView)
        private val routineNameTextView: TextView = itemView.findViewById(R.id.routineNameTextView)
        private val routineDescriptionTextView: TextView =
            itemView.findViewById(R.id.routineDescriptionTextView)

        fun bind(routine: Routine) {
            routineNameTextView.text = routine.name
//            routineDescriptionTextView.text = routine.description
            routineImageView.setImageResource(getImageResource(routine.name))
        }

        private fun getImageResource(name: String): Int {
            return when (name) {
                "Treino A" -> R.drawable.treino_a
                "Treino B" -> R.drawable.treino_b
                else -> throw IllegalArgumentException("Imagem não encontrada para $name")
            }
        }
    }

}
