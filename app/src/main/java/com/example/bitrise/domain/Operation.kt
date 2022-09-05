package com.example.bitrise.domain

enum class Operation(val symbol: Char) {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    PERCENT('%'),
}

val operationSymbols = Operation.values().map { it.symbol }.joinToString("")           // "+-x/%"

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find { it.symbol == symbol }
        ?: throw IllegalArgumentException("Invalid Symbol")
}















