package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a =5;
        var b = 6
        //se puede guardar una funcion anonima en una variable
        var funcion = { x:Int, y:Int -> x+y };
        println("La suma de ${a} + ${b} es ${calculadora(a,b,funcion)}")

        //se podemos modificar la funcion bajo la misma variable
        funcion = { x:Int, y:Int -> x-y };
        println("La resta de ${a} + ${b} es ${calculadora(a,b,funcion)}")

        // ahora con lambdas anonimas
        println("con lambda La resta de ${a} + ${b} es ${calculadora(a,b,{ x:Int, y:Int -> x-y })}")

        // ahora con lambdas anonimas POR ejemplo CABEZA -> CUERPO ULTIMA LINEA ALGO
        println("con lambda La SUMA DE LLAMBDA de ${a} + ${b} es ${calculadora(a,b) 
        { x: Int, y: Int ->
            var numeroA = x
            var numeroB = y
            var resultado = numeroA+numeroB
            resultado
        }}"
        )
    }

    private fun calculadora(numA:Int , numB:Int , fn : (Int ,Int) -> Int): Int {
        return fn(numA,numB)
    }
}



