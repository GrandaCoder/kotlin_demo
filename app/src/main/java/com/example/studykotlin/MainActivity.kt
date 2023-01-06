package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       //operador elvis si algo es ulo hacer algo sino otra cosa. se puede resumir con elvis

        var pais: String? = "Rusia"
        pais = pais ?: "NO ESPECIFICADO"

        println(pais)
    }
}


