package com.sc.marcus.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val engine = CalculatorEngine()
        val input = StringBuilder(inputField.text.toString())

        btnNumber1.setOnClickListener {
            input.append(btnNumber1.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber2.setOnClickListener {
            input.append(btnNumber2.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber3.setOnClickListener {
            input.append(btnNumber3.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber4.setOnClickListener {
            input.append(btnNumber4.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber5.setOnClickListener {
            input.append(btnNumber5.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber6.setOnClickListener {
            input.append(btnNumber6.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber7.setOnClickListener {
            input.append(btnNumber7.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber8.setOnClickListener {
            input.append(btnNumber8.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber9.setOnClickListener {
            input.append(btnNumber9.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnNumber0.setOnClickListener {
            input.append(btnNumber1.text.toString())
            inputField.text = SpannableStringBuilder(input)
        }

        btnAdd.setOnClickListener {
           if(engine.checkOperators(input.toString())) {
               Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
           } else {
               input.append(btnAdd.text)
               inputField.text = SpannableStringBuilder(input)
           }
        }

        btnMinus.setOnClickListener {
            if(engine.checkOperators(input.toString())) {
                Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
            } else {
                input.append(btnMinus.text)
                inputField.text = SpannableStringBuilder(input)
            }
        }

        btnDivide.setOnClickListener {
            if(engine.checkOperators(input.toString())) {
                Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
            } else {
                input.append(btnDivide.text)
                inputField.text = SpannableStringBuilder(input)
            }
        }

        btnMultiply.setOnClickListener {
            if(engine.checkOperators(input.toString())) {
                Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
            } else {
                input.append(btnMultiply.text)
                inputField.text = SpannableStringBuilder(input)
            }
        }

        btnClear.setOnClickListener {
            inputField.text.clear()
            input.clear()
        }

        btnEquals.setOnClickListener {
            if(input.toString() != "" && engine.validMath(input.toString())) {
                val edit = engine.calculateResult(input.toString())
                inputField.text = SpannableStringBuilder(edit)
                input.clear()

            } else {
                Toast.makeText(this, "Type something valid!", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
