package com.cursosant.kotlinbasics

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 13/03/26 at 13:24
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


/*
fun main() {
    println("Estructuras de datos")
    val ahorros = Array<Int>(3){100}
    println(ahorros[0])
    ahorros[1] = 200
    println(ahorros[1])

    val tablero = Array(2) { Array(2){0} }
    tablero[0][0] = 5
    tablero[0][1] = 10
    tablero[1][0] = 20
    tablero[1][1] = 50

    for (i in 0..tablero.size -1) {
        for (j in 0..tablero.size -1) {
            println("i($i), j($j) = ${tablero[i][j]}")
        }
    }

    println("Listas mutables e inmutables")
    val listasololectura: List<String>
    listasololectura = listOf("Alain", "María", "Christian", "Laura")
    println("Lista de solo lectura: $listasololectura")

    val listamodificable: MutableList<String> = mutableListOf("Alain", "María", "Christian", "Laura")
    println("Lista modificable: $listamodificable")
    listamodificable.add("Juan")
    println("Add: $listamodificable")

    listamodificable.remove("Christian")
    println("Remove: $listamodificable")

    listamodificable.removeAt(0)
    println("RemoveAt: $listamodificable")

    listamodificable[1] = "Ana"//listamodificable.set(1, "Ana")
    println("Set: $listamodificable")

    println("Métodos de String")
    //0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
    //K o t l i n   c o u r  s  e     b  y     C  u  r  s  o  s     A  N  T
    val course = "Kotlin course by Cursos ANT"
    println(course.length)
    val target = "Kotlin"
    println(course.compareTo(target))
    println(course.contains(target))
    println(course.lowercase())
    println(course.uppercase())
    println(course.subSequence(0, 6))
    println(course.indexOf("o"))
    println(course.lastIndexOf("o"))
    val empty = "      "
    println(empty.isEmpty())
    println(empty.isBlank())
    println(course.replace('c', 'k'))
    println(course.lowercase().replace('c', 'k'))
    println(course.reversed())
    println(course.slice(20..<course.length))
    println(course.split(" "))
    println(course.startsWith('K'))
    println(course.endsWith('T'))
    println(course.dropLast(4))
    println(course.last())
    println(course.lastOrNull())
    println(course.takeLast(3))
    println(course.substring(17 ,22))
    println(" Curso Kotlin ".trim())
}
*/