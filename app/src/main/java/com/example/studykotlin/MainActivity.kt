package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    //VIDEO:20 min  4:41
    var saldo: Float = 5.5f
    var adicional: Int = 5

    //explicacion de arrays
    var meses: Array<String> = arrayOf("Enero","Febrero","Marzo")
    var recibos: Array<String> = arrayOf("agua","luz","gas")

    //ahora mostramos ua matriz  2D:
    var matriz  = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(1,2,3),
        intArrayOf(1,2,3)
    )

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

        mostrar_saldo()

        ingresar_dinero(500f)

        retirar_dinero(500f)

        recorrer_array(meses)

        recibos[2] = "internet"

        recorrer_array(recibos)

        recorrer_matriz(matriz)

        //---------------- colecciones set conjunto inmutable

        /*Una colección Set es una estructura de datos en Kotlin
        que almacena valores únicos sin ningún orden particular.
        Es útil cuando quieres almacenar un conjunto de elementos y no te importa el orden en que se almacenen,
         pero quieres asegurarte de que no haya elementos repetidos.*/

        var clientesVIP: Set<Int> = setOf(1234,4231,7971)
        println(clientesVIP)

        //saber si un elemento está dentro de un conjunto
        if (clientesVIP.contains(1234)) println("Es VIP") else println("No vip")

        /*
        * MutableSet es una interfaz en Kotlin que extiende la interfaz Set y agrega métodos para modificar la colección.
        *  Es decir, permite añadir, eliminar o actualizar elementos en la colección.*/
        var clientes:MutableSet<Int> = mutableSetOf(354345,25543,33212)
        clientes.add(1212)

        clientes.add(643)

        println(clientes)

        println("-------Listas y mutable list-----------")

        /*En Kotlin, la interfaz List representa una lista de elementos que se pueden acceder por índice. Es inmutable,
         lo que significa que no puedes modificarla una vez que se ha creado. Por otro lado, la interfaz MutableList extiende la interfaz
         List y agrega métodos para modificar la lista. Es decir, permite añadir, eliminar o actualizar elementos en la lista.*/
        var divisas: List<String> = listOf("USD","EUR","YEN")
        println(divisas)
        
        var bolsa: MutableList<String> = mutableListOf("Coca-Cola","Adidas","Amazon")
        println(bolsa)

    }

    private fun recorrer_array(array: Array<String>) {
        for (i in array){
            println(i)
        }

        //indices nos devuelve un valor
        for (i in array.indices){
            println(array[i])
        }

        for (i in (0 until array.size)){
            println(array[i])
        }
    }

    fun mostrar_saldo(){
        println("Tienes $saldo")
    }

    fun ingresar_dinero(dinero : Float){
        saldo += dinero

        println("USted ingresó ${dinero} y ahora dispone de ${saldo}")
    }

    fun retirar_dinero(dinero : Float){

        if(verificar_dinero(dinero)) {
            saldo -= dinero
            println("USted retiró ${dinero} y ahora dispone de ${saldo}")
        }else{
            println("Cantidad ${dinero} superior al saldo ${saldo}")
        }
    }

    fun verificar_dinero(cantidad: Float):Boolean{
        return cantidad <= saldo
    }

    fun recorrer_matriz(array: Array<IntArray>){
        for (i in array){
            for (k in i){
                println(k)
            }
        }
    }


}