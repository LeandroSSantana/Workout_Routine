package com.example.workout_routine.data

import com.example.workout_routine.model.Routine

object FakeRoutineData {
    val routines = listOf(
        Routine(
            "Rotina de treino para iniciantes",
            30,
            listOf("Alongamento", "Agachamentos", "Flexões"),
            1
        ),
        Routine(
            "Rotina de treino para corredores",
            45,
            listOf("Alongamento", "Corrida leve", "Sprints"),
            2
        ),
        Routine(
            "Rotina de treino para levantadores de peso",
            60,
            listOf("Alongamento", "Levantamento de peso", "Supino"),
            3
        )
    )
}