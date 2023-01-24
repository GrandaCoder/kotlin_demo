package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.*
import com.example.studykotlin.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.util.*


class MainActivity : AppCompatActivity() {

    //creamos esta variable
    private lateinit var binding: ActivityMainBinding

    //podria ser de la siguiente manera en caso de estar en otra ventana
    //private lateinit var binding: Activity{nombre actividad}Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //creamos el inflador del binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // y ahora podemos llamar los objetos con el biding
        binding.textView.text = "Hola a todos"


    }

}


