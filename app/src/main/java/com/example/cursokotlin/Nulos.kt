package com.cursosant.kotlinbasics

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 12/03/26 at 12:21
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
    println("Nulos en Kotlin:")
    var nombredeusuario: String? = "AlainNT"
    nombredeusuario = null
    println("Longitúd con ?: ${nombredeusuario?.length}")

    val nombrealterno: String? = "CursosANT"
    nombredeusuario = nombrealterno!!
    println("Longitúd con ?: ${nombredeusuario.length}")

    // ?: = Si lo que esta a la izquierda del ?: no es null, entonces usalo! De lo contrario,
    // asigna el valor después del ?:
    println("Operador Elvis:")
    val nombrereal = "Alain"
    nombredeusuario = null
    println("Dime: ${nombredeusuario ?: nombrereal}")
}