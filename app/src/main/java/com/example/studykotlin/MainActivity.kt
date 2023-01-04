package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //creamos una persona

        println("Revisando si es policia")
        var person: Person = Person("Simon","5236T2FY3",1.80f)
        if (person.checkPolicia(::inColombia)) println("policia") else println("No policia")

    }

    private fun Person.checkPolicia( fn : (Float)-> Boolean):Boolean{
        return  fn(height)
    }

    private fun inColombia(altura:Float):Boolean{
        return altura >= 1.60f
    }

    private fun inEspania(altura:Float):Boolean{
        return altura >= 1.65f
    }

    //Objetos anonimos. NO se han declarado las clases. se crean solo en el momento
    object camilo{
        var apodo = "Granda"
        fun saludo(){
            println("Hola me llaman ${apodo}")
        }
    }



    fun batalla(pokemonA: Pokemon, pokemonB: Pokemon){
        println("Batalla entre ${pokemonA.getName()} vs ${pokemonB.getName()}")

        pokemonA.attack()
        pokemonB.attack()
    }

    //funciones de extencion, es como agregar una funcionalidad a una clase, pero sin heredar
    private fun String.noSPaces():String{
        return this.replace(" ", "")
    }





    // funciones de orden supercior. funciones que reciben funciones

    private fun calculadora(numeroA: Int,numeroB:Int , fn: (Int,Int)-> Int ):Int {
        return  fn(numeroA,numeroB)
    }

    //funcion que recibe dos numeros y develve la suma de los dos
    private fun suma(numA:Int,numB:Int ):Int {
        return numA+numB
    }

    private fun resta(numA:Int,numB:Int ):Int {
        return numA-numB
    }

    // de manera mas corta
    private fun multiplicacion(numA:Int, numB:Int) = numA*numB


}



