package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Desestructuracion
        var sol: Star = Star("Sol",2423f,"Via lactea")
        var (nameSol, radiousSol,GalaxySun) = sol
        println("--------$nameSol")

        //si queremos saltar un parametro. aqui saltamos el radio
        var (nameSol2, _ ,GalaxySun2) = sol

        //tambien se puede sacar con algo que se llama componente
        //aqui sacamos el parametro "name"
        var componente = sol.component1()
        println("Nombre del componente $componente")

    }

}



