package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var saldo: Float = 5.5f
    var adicional: Int = 5
   // var meses: Array<String> = new Array[]

    var numMes: Int = 1

    // video 14: aplicacion del when

    var fecha: String = "23/12/2022"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("EL saldo es "+ (saldo+adicional))

        var mes: String = fecha.subSequence(3,5).toString()

       // println("El mes es $mes")

        when(numMes){
            1,2,3 -> println("Inicio de año")
            4,5,6 -> println("2do cuartode año")
            7,8,9 -> println("3cer cuarto del año")
            10,11,12 -> println("fin de año")
            else -> println("Ojito")
        }

    }
}