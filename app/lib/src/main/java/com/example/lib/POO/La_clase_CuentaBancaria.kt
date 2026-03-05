package com.example.lib.POO

class CuentaBancaria(val titular: String) {
    // El saldo empieza en 0.0
    var saldo: Double = 0.0

    // Método para sumar al saldo e imprimir el nuevo valor
    fun depositar(cantidad: Double) {
        saldo += cantidad
        println("Depósito de $cantidad realizado. Nuevo saldo: $saldo")
    }

    // Método para restar del saldo SOLO si hay suficiente dinero
    fun retirar(cantidad: Double) {
        if (cantidad <= saldo) {
            saldo -= cantidad
            println("Retiro de $cantidad realizado. Saldo restante: $saldo")
        } else {
            // Si no hay suficiente, imprime un mensaje de error
            println("Error: Saldo insuficiente para retirar $cantidad. Saldo actual: $saldo")
        }
    }

    // Método para imprimir el saldo actual del titular
    fun mostrarSaldo() {
        println("Titular: $titular - Saldo actual: $saldo")
    }
}

fun main() {
    // Creamos la cuenta para Maria Garcia
    val cuenta = CuentaBancaria("Maria Garcia")

    // Realizamos las operaciones de prueba
    cuenta.depositar(1500.0)
    cuenta.retirar(400.0)
    cuenta.retirar(800.0)
    cuenta.mostrarSaldo()
}