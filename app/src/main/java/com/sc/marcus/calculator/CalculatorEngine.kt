package com.sc.marcus.calculator


import android.text.Editable
import java.lang.Exception

class CalculatorEngine {

    /*Checks if an operator exists already */
    fun checkOperators(input: String): Boolean {

        return (input.contains("+") || input.contains("-") || input.contains("*") || input.contains(
            "/"
        ))
    }


    /* Calculates the result of the given input - validations checks are already done so no checks are done in this method */
    fun calculateResult(math: String): String {

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
    fun validMath(math: String): Boolean {

        val operator: String? = returnOperator(math) ?: return false

        val operatorPos = math.indexOf(operator!!)

        try {
            math.substring(operatorPos + 2)
            math.substring(operatorPos - 1)
        } catch (e: Exception) {
            return false
        }
        return true
    }

    /* Returns operator from input */
    private fun returnOperator(math: String): String? {
        var operator: String? = null

        when {
            math.contains("+") -> operator = "+"
            math.contains("-") -> operator = "-"
            math.contains("/") -> operator = "/"
            math.contains("*") -> operator = "*"
        }

        return operator
    }
}
