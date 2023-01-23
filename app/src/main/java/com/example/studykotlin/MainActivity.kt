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
        // Crea un arreglo de usuarios
        val users = arrayOf("Camilo","pepe", "Mojica", "Gustavo")

        // Crea un adaptador para la lista de usuarios
        val adapterUser: ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,users)

        // Obtiene las referencias a los widgets en el layout
        var searchView: androidx.appcompat.widget.SearchView = findViewById(R.id.searchView)
        var lvUsers: ListView = findViewById(R.id.lvUsers)

        // Asigna el adaptador a la ListView
        lvUsers.adapter = adapterUser


        // Establece un escucha para el SearchView
        searchView.setOnQueryTextListener(object: androidx.appcompat.widget.SearchView.OnQueryTextListener {
            // Método llamado cuando el usuario envía la consulta
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Limpia el focus del SearchView
                searchView.clearFocus()
                // Si la lista de usuarios contiene la consulta, filtra la lista
                if (users.contains(query)) adapterUser.filter.filter(query)
                return false
            }
            // Método llamado cuando el usuario cambia la consulta
            override fun onQueryTextChange(query: String?): Boolean {
                // Filtra la lista de usuarios según la consulta
                adapterUser.filter.filter(query)
                return false
            }
          }
        )

    }

}


