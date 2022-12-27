package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    //---------colecciones map:

        var mapa: Map<Int,String> = mapOf(
            1 to "España",
            2 to "Mexico",
            3 to "COlombia"
        )

        println()
        println(mapa.keys)

    //------Mapa mutable
        var inversiones:MutableMap<String,Float> = mutableMapOf()
        inversiones.put("Cocacola", 50f)
        inversiones.put("pepsi", 55f)


        println(inversiones)

    //-------Null safety
        //significa que puede ser nulo o no
        var nombre: String? = null;

        if (nombre == null){
            nombre = "Juan"
        }
        println(nombre)
    }

}