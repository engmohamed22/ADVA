package com.example.adva.data.utils

object Validator {
    fun isValidInput(input: String): Boolean {
        return input.isNotEmpty()
    }
}