package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instanciamos el objeto, es decir lo creamos
        var camilo: Person = Person("Camilo","GYU23UY3")
        var person: Person = Person()


        println(camilo.nombre)
        camilo.cambiarNombre()
        println(camilo.nombre)

        val gato = Gato("Misifus", 3, "negro", "liso")
        gato.color = "azul"

        var waterPok = WaterPokemon("Motas",10f,100f)

        waterPok.attack()

    }


}



