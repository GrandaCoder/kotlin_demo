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

        var nombreFruta: String ="manzana"

        var palabra = ""

        funcionA()
        funcionB()

        if (true) {

            //Borrar comentario
            //Borrar comentario
            //Borrar comentario
            //Borrar comentario
        }

        //podemos  guardar lineas como favoritas
        var favorita: String = "Ctrl + f11 o f11"


        //para buscar la linea es mayusculas + f11

        // ALT + J
        //Quiero seleccionar ESTO
        //Quiero seleccionar no
        //Quiero seleccionar ESTO
        //Quiero seleccionar no
        //Quiero seleccionar ESTO

    }

    //Esto se borra si presiono ctrl + Y

    // si presionamos CTRL + D se duplica la linea
    // si presionamos CTRL + D se duplica la linea
    // si presionamos CTRL + D se duplica la linea
    // si presionamos CTRL + D se duplica la linea

    private fun funcionB() {
        TODO("Not yet implemented")
    }

    private fun funcionA() {
        TODO("Not yet implemented")
    }
}


