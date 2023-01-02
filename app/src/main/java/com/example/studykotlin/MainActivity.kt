package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firePok = FirePokemo("Fogon",10f,100f)

        var waterPok = WaterPokemon("Hielo",69f,85f)


        batalla(firePok,waterPok)

        firePok.decirGracias()
        firePok.bye()

    }

    fun batalla(pokemonA: Pokemon, pokemonB: Pokemon){
        println("Batalla entre ${pokemonA.getName()} vs ${pokemonB.getName()}")

        pokemonA.attack()
        pokemonB.attack()
    }


}



