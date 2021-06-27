package com.example.lexueoude.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.lexueoude.R

class CalculatorActivity : AppCompatActivity() {

    var isPlus: Boolean = false;
    var isMinus: Boolean = false;
    var isDiv: Boolean = false;
    var isMul: Boolean = false;
    lateinit var editText: EditText;
    var number: Float = 0.0f;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculator_layout)
        editText = findViewById(R.id.number_edit_text);
//        test
//        test
//        master 注释1
        //dev_lxianj
        //修改a
    }

    fun test(){

    }

    fun operationFunction(view: View) {
        when (view.id) {

            R.id.button_one -> {
                numberClick(1)
            }
            R.id.button_two -> {
                numberClick(2)
            }
            R.id.button_three -> {
                numberClick(3)
            }
            R.id.button_four -> {
                numberClick(4)
            }
            R.id.button_five -> {
                numberClick(5)
            }
            R.id.button_six -> {
                numberClick(6)
            }
            R.id.button_seven -> {
                numberClick(7)
            }
            R.id.button_eight -> {
                numberClick(8)
            }
            R.id.button_nine -> {
                numberClick(9)
            }

            R.id.C -> {
                editText.setText("")
            }
            R.id.point -> {
                pointClick()
            }
            R.id.plus -> {
                plusClick()
            }
            R.id.minus -> {
                minusClick()
            }
            R.id.div -> {

                divClick()
            }
            R.id.mul -> {
                mulClick()
            }

            R.id.eql -> {

                eqlClick()

            }
        }
    }

    private fun eqlClick() {
        val eql = editText.text.toString()
        if (eql.equals("."))return
        if (eql.equals("x"))return
        if (eql.equals("/"))return
        if (eql.equals("+"))return

        when {
            isPlus -> {
                plus()
            }
            isMinus -> {
                minus()
            }
            isDiv -> {
                div()
            }
            isMul -> {
                mul()
            }
        }
    }

    private fun mul() {
        val number2 = editText.text.toString().toFloat();
        val result = number * number2;
        editText.setText(result.toString())
        isMul = false
    }

    private fun div() {
        val number2 = editText.text.toString().toFloat();
        val result = number / number2;
        editText.setText(result.toString())
        isDiv = false
    }

    private fun minus() {
        val number2 = editText.text.toString().toFloat();
        val result = number - number2;
        editText.setText(result.toString())
        isMinus = false
    }

    private fun plus() {
        val number2 = editText.text.toString().toFloat();
        val result = number + number2;
        editText.setText(result.toString())
        isPlus = false
    }

    private fun divClick() {
        number = editText.text.toString().toFloat()
        editText.setText("")
        isDiv = true;
    }

    private fun mulClick() {
        number = editText.text.toString().toFloat()
        editText.setText("")
        isMul = true
    }

    private fun minusClick() {
        number = editText.text.toString().toFloat();
        editText.setText("")
        isMinus = true;
    }

    private fun plusClick() {
        number = editText.text.toString().toFloat();
        editText.setText("");
        isPlus = true;
    }

    private fun pointClick() {
        val number = editText.text.toString() + "."
        editText.setText(number)
    }

    private fun numberClick(number :Int) {
        val number = editText.text.toString() + number.toString();
        editText.setText(number)
    }
}