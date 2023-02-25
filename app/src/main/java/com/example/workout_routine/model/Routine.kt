package com.example.workout_routine.model

data class Routine (

    val name: String,
    val duration: Int,
    val exercises: List<String>,
    val intensity: Int,
//    val image: Int?,
//    val description: String?,
//    val repetition: String?,
)