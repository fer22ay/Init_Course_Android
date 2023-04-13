package com.fernando.curso.introduccion

/**
 * Extension Functions
 */

fun main() {

    val nombre = "Gaston"
    println(nombre.uppercase())

    val numero = 10
    println(numero.toString())

    println("Remover primer caracter: ${nombre.removerPrimerCaracter()}")

    mainValuesNull()

    Elemento(Persona("Gaston", "Saillen", 25))

}

fun String.removerPrimerCaracter() : String = this.substring(1)


/**
 * Nulabilidad en kotlin
 */
fun mainValuesNull() {

    val nombre: String? = null

    // Elvis operator
    //val nombre2 = nombre?.length ?: "Leo".length

    nombre?.let {
        println(it)
    }

    // !! = Le digo explicitamente que no va ser null
    //println(nombre2)

}

/**
 *
 */
fun genericos() {
    val lista = arrayOf("Gaston", "24")
}

data class Persona(val nombre: String, val apellido: String, val edad: Int)

/**
 * Clase generica
 */
class Elemento<T>(value: T) {
    init {
        println("El valor es $value")
    }
}