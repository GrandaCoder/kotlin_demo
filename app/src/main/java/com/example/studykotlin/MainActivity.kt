package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //widgets

        //Image view
        var webView = findViewById<WebView>(R.id.webView)
        var webssetigs:WebSettings = webView.getSettings()
        webssetigs.javaScriptEnabled = true
        webView.setWebViewClient(WebViewClient())

        webView.loadUrl("https://listado.mercadolibre.com.co/pesas#D[A:pesas]")

    }


}


