package com.example.studykotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tvEJemplo: TextView = findViewById(R.id.tvEjemplo)
        tvEJemplo.text = "Text cambiado desde codigo"
        tvEJemplo.setTextColor(Color.RED)


    }

}


