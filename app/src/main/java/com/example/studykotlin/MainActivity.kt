package com.example.studykotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener


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

        //podemos agregar un error a un campo de texto
        var etEjemplo: EditText = findViewById(R.id.etEjemplo)

        //listener que cabia
        etEjemplo.addTextChangedListener {
            if (etEjemplo.text.length == 0){
                etEjemplo.setError("Campo vacio")
            }
        }

        etEjemplo.setSelection(3)
        var inicio = etEjemplo.selectionStart
        var end = etEjemplo.selectionEnd


    }

}


