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
        // progress bar

        var pbDeterminado = findViewById<ProgressBar>(R.id.pBDeterminado)
        pbDeterminado.max = 300
        pbDeterminado.progress = 0

        //necesitamos que termine el oncreate, creamos un hilo globalscope
        GlobalScope.launch {
            progressMananger(pbDeterminado)
        }
    }

    private fun progressMananger(pbDeterminado: ProgressBar) {

        while (pbDeterminado.progress < pbDeterminado.max){
            sleep(1000L)
            pbDeterminado.incrementProgressBy(5)
        }

    }


}


