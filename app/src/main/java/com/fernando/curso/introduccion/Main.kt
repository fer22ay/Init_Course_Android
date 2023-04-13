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

}

fun String.removerPrimerCaracter() : String = this.substring(1)