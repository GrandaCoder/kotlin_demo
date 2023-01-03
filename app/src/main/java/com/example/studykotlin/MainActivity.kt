package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //subclases anidadas
        var sc = SubCLasses()
        println(sc.presentar())

        var ani = SubCLasses.Anidada()
        println(ani.presentar())

        //se crea el padre. porque internal esta haciendo uso de la variable padre
        var inn = SubCLasses().Interna()
        println(inn.prsentar())

    }




    fun batalla(pokemonA: Pokemon, pokemonB: Pokemon){
        println("Batalla entre ${pokemonA.getName()} vs ${pokemonB.getName()}")

        pokemonA.attack()
        pokemonB.attack()
    }


}



