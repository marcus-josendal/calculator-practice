package com.sc.marcus.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.SpannableStringBuilder
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val engine = CalculatorEngine()
        var input = inputField.text

        btnNumber1.setOnClickListener {
            input.append(btnNumber1.text)
        }

        btnNumber2.setOnClickListener {
            input.append(btnNumber2.text)
        }

        btnNumber3.setOnClickListener {
            input.append(btnNumber3.text)
        }

        btnNumber4.setOnClickListener {
            input.append(btnNumber4.text)
        }

        btnNumber5.setOnClickListener {
            input.append(btnNumber5.text)
        }

        btnNumber6.setOnClickListener {
            input.append(btnNumber6.text)
        }

        btnNumber7.setOnClickListener {
            input.append(btnNumber7.text)
        }

        btnNumber8.setOnClickListener {
            input.append(btnNumber8.text)
        }

        btnNumber9.setOnClickListener {
            input.append(btnNumber9.text)
        }

        btnNumber0.setOnClickListener {
            input.append(btnNumber0.text)
        }

        btnAdd.setOnClickListener {
           if(engine.checkOperators(input.toString())) {
               Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
           } else {
               input.append(btnAdd.text)
           }
        }

        btnMinus.setOnClickListener {
            if(engine.checkOperators(input.toString())) {
                Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
            } else {
                input.append(btnMinus.text)
            }
        }

        btnDivide.setOnClickListener {
            if(engine.checkOperators(input.toString())) {
                Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
            } else {
                input.append(btnDivide.text)
            }
        }

        btnMultiply.setOnClickListener {
            if(engine.checkOperators(input.toString())) {
                Toast.makeText(this, "Only use one operator", Toast.LENGTH_SHORT).show()
            } else {
                input.append(btnMultiply.text)
            }
        }

        btnClear.setOnClickListener {
            input.clear()
        }

        btnEquals.setOnClickListener {
            if(input.toString() != "" && engine.validMath(input.toString())) {
                val edit = engine.calculateResult(input.toString())
                inputField.text = SpannableStringBuilder(edit)

            } else {
                Toast.makeText(this, "Type something valid!", Toast.LENGTH_SHORT).show()
            }
        }
    }

}
