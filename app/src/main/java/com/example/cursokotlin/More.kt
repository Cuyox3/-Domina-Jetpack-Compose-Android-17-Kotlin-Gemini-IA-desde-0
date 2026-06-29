package com.cursosant.kotlinbasics

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 15/03/26 at 09:21
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
val global = 4
const val SEPARATOR: String = "==================="

lateinit var lateinitText: String
val startTime: Long = time()
val endTime: Long = time()
val lazyTime: Long by lazy { time() }

fun time(): Long {
    return System.currentTimeMillis()
}

fun main() {
    newTopic("Variables Locales y Globales")
    val local1 = 1
    println(local1)
    //println(local2)
    println(global)

    local()

    newTopic("Lateinit & Lazy")
    lateinitText = "Cursos ANT"
    println(lateinitText)

    Thread{
        Thread.sleep(2_000)
        println(startTime)
        println(endTime)
        println(lazyTime)
    }.start()
}

fun local() {
    val local2: Int = 2
    println(local2)
    //println(local1)
    println(global)
}






