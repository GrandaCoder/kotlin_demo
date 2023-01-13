package com.example.studykotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instanciamos el objeto
        var tvEJemplo: TextView = findViewById(R.id.tvEjemplo)
        tvEJemplo.text = "Text cambiado desde codigo"
        tvEJemplo.setTextColor(Color.RED)

        //para abrir os listeners "Objeto setOnEvento"
        tvEJemplo.setOnClickListener {
            Toast.makeText(this,"Me hicieron click",Toast.LENGTH_SHORT).show()
            tvEJemplo.setTextColor(Color.GREEN)
        }
    }

}


