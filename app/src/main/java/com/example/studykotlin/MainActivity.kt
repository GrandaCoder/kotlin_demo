package com.example.studykotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import androidx.core.widget.addTextChangedListener
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //traemos los groups chips
        var cgCondiciones = findViewById<ChipGroup>(R.id.cgCondiciones)
        var chip:Chip

        //sacamos cada uno de los chips, como esto recibe de tipo view se hace un casteo
        for (i in 0 until cgCondiciones.childCount){
            chip = cgCondiciones.getChildAt(i) as Chip // se convierte en chip

            // le agregamos los listeners, si se presiona en la x se elimina el chip
            chip.setOnCloseIconClickListener {
                cgCondiciones.removeView(it)
            }

            //si se hace click se muestra un mensaje
            chip.setOnClickListener {
                var aux = it as Chip
                Toast.makeText(this,"${aux.text} pulsado",Toast.LENGTH_SHORT).show()
            }
        }

        //agegamos un chip desde codigo
        val chipNew = Chip(this)
        chipNew.text ="Opcion"
        chipNew.chipIcon = ContextCompat.getDrawable(this,R.drawable.ic_email)
        chipNew.isCloseIconVisible = true
        chipNew.isCheckedIconVisible = true
        chipNew.isClickable =true
        chipNew.isClickable =false

        // lo agregamos al chip group
        cgCondiciones.addView(chipNew as View)
        chipNew.setOnCloseIconClickListener { cgCondiciones.removeView(chipNew as View) }


    }

}


