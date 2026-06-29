package com.cursosant.kotlinbasics

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 12/03/26 at 15:02
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
    println("Sentencias condicionales:")
    if (false) println("Condición exitosa!")
    println(":(")
    if (true) {
        println("Condición exitosa!")
        println(":)")
    }

    println("Operadores de igualdad:")
    if (1 == 1) {
        println("Es igual")
        if (1 == 2) {
            println("No es igual")
        }
    }

    //! && ||
    println("Operadores lógicos:")
    if (1 != 2) println("Es diferente")
    //true y true = true -- true y false = false -- false Y true = false -- false y false = false
    if (1 == 1 && 1 != 2) println("Las 2 fueron válidas")
    //true o true = true -- true o false = true -- false o true = true -- false o false = false
    if (1 == 1 || 1 == 2) println("Al menos una fue válida")

    println("Operadores de comparación y Sentencia if-else")
    val a = 14
    val b = 5
    if (a >= b) println("A es mayor o igual que B")
    else println("A el menor que B")

    if (a < b) {
        println("A es menor que B")
    } else if (a > b) {
        println("A es mayor que B")
    } else {
        println("A es igual que B")
    }

    println("Sentencia when")
    println("Consulta tus saldos, ingresa tu número de cuenta:")
    val tarjeta = readln()
    when(tarjeta){
        "101" -> println("$15.0 USD")
        "201" -> println("$215.0 USD")
        "301",
        "321" -> println("$315.0 USD")
        "501" -> {
            println("$21.0 USD")
            println("$100.0 USD")
        }
        else -> println("Cuenta no encontrada.")
    }
}












