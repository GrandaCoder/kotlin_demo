package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.ArraySet

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cuentaRegresiva()

        //array de pares
        var numeros:Array<Int> = arrayOf(0,1,2,3,4,5,6,7,8,9,10)
        mostrarPares(numeros)

        var plastosCarta1:Array<String> = arrayOf("salchipapa","burritos","carne gratinada")
        recorrerPlato(plastosCarta1)


    }

    private fun recorrerPlato(platos: Array<String>) {
        for (plato in platos)
            println(plato)
    }

    private fun recorrerPlatoSet(platos: Set<String>) {
        for (plato in platos)
            println(plato)
    }

    /*Usa un bucle while para recorrer todos los números del 1 al 10 y mostrar únicamente los pares*/
    private fun mostrarPares(numeros : Array<Int>) {
        var i = 0
        while (i<numeros.size){
            if((numeros[i]%2) == 0){
                println("Par ${numeros[i]}")
            }
            i++
        }
    }

    /*Usa un bucle do-while para mostrar por pantalla una cuenta regresiva del 9 al 0
    igual que cuando hay un lanzamiento de un cohete por parte de la NASA.*/
    private fun cuentaRegresiva() {
        var i: Int = 9
        do{
            if (i == 0) {
                println("Despegueeee!")
                break
            }else {
                println(i--)
            }
        }while (true)
    }




}