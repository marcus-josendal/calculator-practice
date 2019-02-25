package com.sc.marcus.calculator

import android.app.Instrumentation
import android.content.Context
import android.text.Editable
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val test = Editable.Factory().newEditable("4+4")
    private val engine = CalculatorEngine()


    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun shouldCheckIfOperatorAlreadyExistInString() {
        assertTrue(engine.checkOperators(test))
    }

}
