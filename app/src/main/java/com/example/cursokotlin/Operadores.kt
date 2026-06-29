package com.cursosant.kotlinbasics

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 12/03/26 at 13:19
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
    println("Conversión")
    val b: Int = 5
    val c: Long = 20L
    var resultado: Long = b.toLong()
    println(resultado)

    val d: Double = 12.54
    resultado = d.toLong()
    println(resultado)
    println(c.toFloat())

    val numerotexto: String = "6.4"
    println(numerotexto.toDouble())

    println("Operadores matemáticos.\nInserte un número:")
    val x = readln()
    println("Inserte otro número:")
    val y = readln()

    var numerox = x.toInt()
    val numeroy = y.toInt()

    println("x($x) + y($y) = ${numerox + numeroy}")//suma
    println("x($x) - y($y) = ${numerox - numeroy}")//resta
    println("x($x) * y($y) = ${numerox * numeroy}")//multiplicación
    println("x($x) / y($y) = ${numerox / numeroy}")//divisón
    println("x($x) % y($y) = ${numerox % numeroy}")//módulo

    println("Operadores con tareas aumentadas:")
    numerox *= numeroy// numerox = numerox * numeroy
    println("x($x) * y($y) = ${numerox}")

    println("Operadores de incremento y decremento:")
    var longitud = 0
    var saldo = 1_000
    longitud++ // longitud = longitud + 1
    saldo-- // saldo = saldo - 1
    println("Longitúd: $longitud")
    println("Saldo: $saldo")
}













