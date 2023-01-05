package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var array4 = IntArray(5){5q} //multiplica los valores por 3 arroja 3,,6,9

        //una funcion de orden superior que se le pasa una lambda que suma cada elemento,
        // la funcion de orden superior lo que hace es que recorre cada elemento
        var suma = 0
        recorrerArray(array4){
            suma += it
        }

        println("la respuesta de la suma es $suma")

    }

    private fun recorrerArray(array: IntArray, fn: (Int)->Unit){
        for(i in array)
            fn(i)
    }

}



