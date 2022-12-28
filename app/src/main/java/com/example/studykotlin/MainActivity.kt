package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

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

        val plastosCarta2:Array<Set<Any>> = arrayOf(
            setOf("Salchipapa",18f),
            setOf("burritos",12f),
            setOf("carne gratinada",20f)
        )

        recorrerPlatoSet(plastosCarta2)


        val plastosCarta3:Array<Set<Any>> = arrayOf(
            setOf("Salchipapa",18f, arrayOf("Salchicha","papitas","salsas")),
            setOf("burritos",12f, arrayOf("carne","maiz","salsas")),
            setOf("carne gratinada",20f,arrayOf("carne de res","papa francesa","salsas"))
        )


        println("-------  ---------- ---------")
        recorrerPlatosConIngredientes(plastosCarta3)

    }

    /*Crea el mismo ejercicio de antes pero ahora con un array de conjuntos de datos*/
    private fun recorrerPlatosConIngredientes(platos: Array<Set<Any>>) {
        for (plato in platos){
            val name = plato.first()
            val price = plato.elementAt(platos.size-2)
            val ingredientes = plato.elementAt(platos.size-1) as Array<*>
            var resultado = "$name: $price € Ingredientes :"
            for (ingrediente in ingredientes) resultado += " $ingrediente"

            println(resultado)
        }
    }

    /*Usa un bucle for para recorrer un array en el que estén almacenados los diferentes platos que ofrece un restaurante y mostrarlos por pantalla*/
    private fun recorrerPlato(platos: Array<String>) {
        for (plato in platos){
            println(plato)
        }

    }

    /*Crea el mismo ejercicio de antes pero ahora con un array de conjuntos de datos*/
    private fun recorrerPlatoSet(platos: Array<Set<Any>>) {
        for (plato in platos){
            val name = plato.first()
            val price = plato.last()
            println("$name: $price €")
        }
    }

    /*Usa un bucle while para recorrer todos los números del 1 al 10 y mostrar únicamente los pares Cada elemento
     del array debe contener el nombre del plato y su precio*/
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



