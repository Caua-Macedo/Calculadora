package com.example.calculadora


import android.os.Bundle
import android.service.autofill.FieldClassification
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var edtNum = findViewById<EditText>(R.id.edtNum)
        var num1 = 0.0
        var operacao = ""

        val btn1 = findViewById<Button>(R.id.btn1)
        btn1.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "1")
        }

        val btn2 = findViewById<Button>(R.id.btn2)
        btn2.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "2")
        }

        val btn3 = findViewById<Button>(R.id.btn3)
        btn3.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "3")
        }

        val btn4 = findViewById<Button>(R.id.btn4)
        btn4.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "4")
        }

        val btn5 = findViewById<Button>(R.id.btn5)
        btn5.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "5")
        }

        val btn6 = findViewById<Button>(R.id.btn6)
        btn6.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "6")
        }

        val btn7 = findViewById<Button>(R.id.btn7)
        btn7.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "7")
        }

        val btn8 = findViewById<Button>(R.id.btn8)
        btn8.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "8")
        }

        val btn9 = findViewById<Button>(R.id.btn9)
        btn9.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "9")
        }

        val btn0 = findViewById<Button>(R.id.btn0)
        btn0.setOnClickListener {
            var texto = edtNum.text.toString()
            edtNum.setText(texto + "0")
        }

        val btnSoma = findViewById<Button>(R.id.btnSoma)
        btnSoma.setOnClickListener {
            val texto = edtNum.text.toString()
            if (texto.isNotEmpty() && texto.last() != '+' && texto.last() != '-' && texto.last() != '*' && texto.last() != '/') {
                edtNum.setText(texto + "+")
            }
        }

        val btnSub = findViewById<Button>(R.id.btnSub)
        btnSub.setOnClickListener {
            val texto = edtNum.text.toString()
            if (texto.isNotEmpty() && texto.last() != '+' && texto.last() != '-' && texto.last() != '*' && texto.last() != '/') {
                edtNum.setText(texto + "-")
            }
        }

        val btnMult = findViewById<Button>(R.id.btnMult)
        btnMult.setOnClickListener {
            val texto = edtNum.text.toString()
            if (texto.isNotEmpty() && texto.last() != '+' && texto.last() != '-' && texto.last() != '*' && texto.last() != '/') {
                edtNum.setText(texto + "*")
            }
        }

        val btnDiv = findViewById<Button>(R.id.btnDiv)
        btnDiv.setOnClickListener {
            val texto = edtNum.text.toString()
            if (texto.isNotEmpty() && texto.last() != '+' && texto.last() != '-' && texto.last() != '*' && texto.last() != '/') {
                edtNum.setText(texto + "/")
            }
        }

        val btnCE = findViewById<Button>(R.id.btnCE)
        btnCE.setOnClickListener{
            edtNum.setText("")

        }

        val btnIgual = findViewById<Button>(R.id.btnIgual)
        btnIgual.setOnClickListener {

            var conta = edtNum.text.toString()

            while (conta.contains("*") || conta.contains("/")){

                var i = 0
                while (i < conta.length){

                    if (conta[i] == '*' || conta[i] == '/') {

                        var inicio = i - 1
                        while (inicio >= 0 && (conta[inicio].isDigit() || conta[inicio] == '.')) {
                            inicio--
                        }
                        inicio++

                        var fim = i + 1
                        while (fim < conta.length && (conta[fim].isDigit() || conta[fim] == '.')) {
                            fim++
                        }

                        val num1 = conta.substring(inicio, i).toDouble()
                        val num2 = conta.substring(i + 1, fim).toDouble()
                        var resultado = 0.0

                        if (conta[i] == '*')  {

                            resultado = num1 * num2

                        }
                        else if (num2 == 0.0){

                            edtNum.setText("Erro! Divisão por 0")
                            return@setOnClickListener

                        }else resultado = num1 / num2


                        conta = conta.substring(0, inicio) + resultado + conta.substring(fim)
                        break
                    }

                    i++
                }

            }

            while (conta.contains("+") || conta.contains("-")) {

                var i = 1
                while (i < conta.length) {

                    if (conta[i] == '+' || conta[i] == '-') {

                        var inicio = i - 1
                        while (inicio >= 0 && (conta[inicio].isDigit() || conta[inicio] == '.')) {
                            inicio--
                        }
                        inicio++

                        var fim = i + 1
                        while (fim < conta.length && (conta[fim].isDigit() || conta[fim] == '.')) {
                            fim++
                        }

                        val num1 = conta.substring(inicio, i).toDouble()
                        val num2 = conta.substring(i + 1, fim).toDouble()

                        val resultado = if (conta[i] == '+') num1 + num2 else num1 - num2

                        conta = conta.substring(0, inicio) + resultado + conta.substring(fim)
                        break
                    }

                    i++
                }
            }

            // mostra resultado no EditText
            edtNum.setText(conta)

        }
    }
}