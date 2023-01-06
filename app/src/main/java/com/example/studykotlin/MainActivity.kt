package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var password: String = "1234"

        // entra en el throw la aplicacion da error
        if (password.length < 6) {
            throw ContraseniaIlegal("Constraseña muy corta")
        }else{
            println("Contraseña correcta")
        }

    }
}
//podemos crear nuestros propios errores.!

class ContraseniaIlegal(mensaje:String) : Exception(mensaje)

