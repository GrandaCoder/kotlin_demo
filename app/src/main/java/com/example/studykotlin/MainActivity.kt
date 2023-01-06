package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {

    // va aqui porque es un atributo de un OBJETO lateinit quiere decir que se inicializa despues,
    private lateinit var atributoPersona:Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       // A DIFERENCIA DE
         var variablePersona:Person
        // es una variable y no un atributo
    }
}


