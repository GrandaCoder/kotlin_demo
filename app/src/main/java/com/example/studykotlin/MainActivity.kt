package com.example.studykotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
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


        //instanciamos el objeto para modificar sus valores, este es autocompletador. como una lista de valores
        var autoCompleteTextView: AutoCompleteTextView = findViewById(R.id.autoCompleteTextView)

        var countries: Array<String> = resources.getStringArray(R.array.paises)
        var adapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,countries)

        autoCompleteTextView.setAdapter(adapter)

        //multi-complete
        var multiAutoCompleteTextView: MultiAutoCompleteTextView = findViewById(R.id.multiAutoCompleteTextView)
        multiAutoCompleteTextView.setAdapter(adapter)
        multiAutoCompleteTextView.setTokenizer(MultiAutoCompleteTextView.CommaTokenizer())


    }

}


