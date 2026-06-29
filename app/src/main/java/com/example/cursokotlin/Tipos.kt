package com.cursosant.kotlinbasics

/**
 * Project: Kotlin Basics
 * From: com.cursosant.kotlinbasics
 * Created by: Alain Nicolás Tello.
 * On: 11/03/26 at 09:26
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
 
/** 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024...
 * 1 bit = 1 ó 0, la unidad más básica del sistema informático
 * 1 byte = 8 bits
 * 1 Kb = 1024 bytes
 * 1 Mb = 1024 Kb
 * 1 Gb = 1024 Mb
 * 1 Tb = 1024 Gb...
 * */
fun main() {
    println("Boolean:")
    val soyinstructor: Boolean = true//true = 1, false = 0
    println("¿Soy Instructor?")
    println(soyinstructor)

    println("Enteros Int y Long:")//00 = -1, 01 = -2 ---- 10 = 0, 11 = 1
    val minutoscaminando: Int = 420_130 //-2,147,483,648 - 2,147,483,647
    //val max = Int.MAX_VALUE
    println(minutoscaminando)

    val segundoscaminando: Long = 300_000_000_000L //-9223372036854775808L - 9223372036854775807L
    val max = Long.MAX_VALUE
    println(segundoscaminando)

    println("Decimanles Float y Double:")
    val altura: Float
    altura = 1.73f //1.4E-45F - 3.4028235E38F
    println(altura)
    val alturareal: Double = 1.733_333_333_333 //4.9E-324 - 1.7976931348623157E308
    println(alturareal)

    println("Texto Char:")
    val inicial1: Char = 'A'
    val inicial2: Char = 'N'
    val inicial3: Char = 'T'
    val nuevalinea: Char = '\n'
    print(inicial1)
    print(inicial2)
    print(inicial3)
    print(nuevalinea)

    println("Texto String:")
    val iniciales: String = "ANT"
    println(iniciales)
    val casosespeciales: String = "\tA\'N\'T\\ \$iniciales"
    println(casosespeciales)

    println("Entrada de datos(readline)")
    val nombrereal = readln()
    println(nombrereal)

    println("Concatenación:")
    println("Hola " + nombrereal + ", bienvenido.")

    println("String Templates:")
    println("Hola $nombrereal, bienvenido.")
    println("Lognitúd: ${nombrereal.length}")

    println("Multiline String(Raw String):")
    val lineasmultiples: String = """
        Estoy "escribiendo"
            con sangría!
            ...
    """//.trimIndent()
    println(lineasmultiples)
}














