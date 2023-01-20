package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.CalendarView
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import java.util.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //widgets

        //calendar
        var cvEjemplo = findViewById<CalendarView>(R.id.calendarView)
        var tvFeacha = findViewById<TextView>(R.id.textView)

        cvEjemplo.setOnDateChangeListener { calendarView, year, month, day ->
            var date = "$day/${1+month}/$year"
            tvFeacha.text = "Fecha seleccionada: $date"

        }

        var calendar = Calendar.getInstance()
        calendar.set(2026,2,22)
        cvEjemplo.date = calendar.timeInMillis



    }


}


