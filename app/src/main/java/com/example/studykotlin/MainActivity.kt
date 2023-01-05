package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//se tienen que declarar aqui arriba
typealias aliasObjeto = SubCLasses.Anidada

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //ejemplo de typeAlias
        var ani:aliasObjeto = aliasObjeto()
        ani.presentar()
    }

}



