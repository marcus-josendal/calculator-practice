package com.sc.marcus.calculator


import android.app.Activity
import android.content.Context
import android.text.Editable
import android.util.Log
import android.widget.TextView
import java.lang.Exception

class CalculatorEngine {

    /*Checks if an operator exists already */
    fun checkOperators(input: Editable): Boolean {
        val inputField = input.toString()

        return (inputField.contains("+") || inputField.contains("-") || inputField.contains("*") || inputField.contains(
            "/"
        ))
    }


    /* Calculates the result of the given input - validations checks are already done so no checks are done in this method */
    fun calculateResult(math: Editable): String {

        val input = math.toString()
        val operator: String? = returnOperator(math)

        val operatorPos = input.indexOf(operator!!)
        val sub1 =  input.substring(0, operatorPos).toInt()
        val sub2 = input.substring(operatorPos + 1, input.length).toInt()
        var result: Number? = null

        when (operator) {
            "+" -> result = sub1 + sub2
            "-" -> result = sub1 - sub2
            "/" -> result = sub1 / sub2
            "*" -> result = sub1 * sub2
        }

        return result.toString()
    }

    /* Checks if the given input is valid math */
    fun validMath(math: Editable): Boolean {

        val input = math.toString()
        val operator: String? = returnOperator(math) ?: return false

        val operatorPos = input.indexOf(operator!!)

        try {
            input.substring(operatorPos + 2)
            input.substring(operatorPos - 1)
        } catch (e: Exception) {
            return false
        }
        return true
    }

    /* Returns operator from input */
    private fun returnOperator(math: Editable): String? {
        val input = math.toString()
        var operator: String? = null

        when {
            input.contains("+") -> operator = "+"
            input.contains("-") -> operator = "-"
            input.contains("/") -> operator = "/"
            input.contains("*") -> operator = "*"
        }

        return operator
    }
}
