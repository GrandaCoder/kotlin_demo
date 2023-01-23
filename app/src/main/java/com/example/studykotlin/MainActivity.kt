package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //widgets

        //raitingBar

        //traemos el objeto raiting bar
        var ratingBar: RatingBar = findViewById(R.id.ratingBar)
        //traemos el text view
        var textView : TextView = findViewById(R.id.textView)

        //colocamos un valor por defecto
        ratingBar.rating = 2.5f

        //agregamos un listener
        ratingBar.setOnRatingBarChangeListener { rbObject, rating, _ ->
            textView.text = "$rating/${rbObject.numStars}"
        }


    }

}


