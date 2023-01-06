package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //lazy es como para decir en caso de que no se haya inicilializado
        val nombre: String by lazy { "Sin nombre" }

        //imprimirá sin nombre
        println(nombre)
    }
}


