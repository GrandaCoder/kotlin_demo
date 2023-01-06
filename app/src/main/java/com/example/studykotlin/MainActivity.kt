package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var camilo: Person = Person("Camilo", "565F5",1.66F)

        //Visualemente mejor, merece la pena cuando es mucho cambios
        camilo.let {
            it.die()
            it.nombre = "Juan"
        }

        camilo.apply {
            this.die()
            this.nombre = "Pepe"
        }.also {
            it.passport = "NI3INR"
        }

        var maria = Person("Camilo", "565F5",1.66F).run {
            this.die()
            this.height = 1.54f

            // no se esta creando la persona, se ejecutan ciertas cosas
            "Este es el ultimo valor que se almacena en maria"
        }
    }
}


