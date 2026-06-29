package com.cursosant.kotlinbasics

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 14/03/26 at 12:05
 * All rights reserved 2026.
 *
 * All my Udemy Courses:
 * https://www.udemy.com/user/alain-nicolas-tello/
 * And Frogames formación:
 * https://cursos.frogamesformacion.com/pages/instructor-alain-nicolas
 *
 * Coupons on my Website:
 * www.alainnicolastello.com
 */

fun main() {
    newTopic("Funciones")
    basic()
    arguments("Alain")
    println(returnData())

    newTopic("Lambda")
    val multi = multi(2, 3)
    println("Multiplicar: $multi")
    val lambda = {a: Int, b: Int ->
        a * b
    }
    println("Multiplicar: ${lambda(2,3)}")

    newTopic("Funciones de orden superior")
    sum(2,3){ z ->
        println(z)
    }

    newTopic("Coroutines")
    val scope = CoroutineScope(Dispatchers.Default)
    scope.launch {
        println("Iniciando corrutina...")
        delay(2_000)
        println("...termina corrutina.")
    }

    readln()
    println("Fin del código.")
}

fun sum(x: Int, y: Int, result: (Int) -> Unit) {
    var z = 0
    Thread {
        Thread.sleep(300)
        println("procesando...")
        z = x + y
        result(z)
    }.start()
}
/*fun sum(x: Int, y: Int): Int {
    var z = 0
    Thread {
        Thread.sleep(2_000)
        println("procesando...")
        z = x + y
    }.start()
    return z
}*/

fun multi(a: Int, b: Int): Int {
    return a * b
}

fun returnData(): String {
    return "Datos retornados..."
}

fun arguments(name: String) {
    println("Hola $name")
}

fun basic() {
    println("Cursos ANT")
}

fun newTopic(topic: String) {
    println("\n$SEPARATOR $topic $SEPARATOR")
}









