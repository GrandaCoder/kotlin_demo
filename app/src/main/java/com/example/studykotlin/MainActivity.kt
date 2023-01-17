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

        //Traemos el onjeto radio groups
        var rgVacaciones = findViewById<RadioGroup>(R.id.rgVacaciones)

        //este es el button
        var radioButton = rgVacaciones.getChildAt(1) as RadioButton
        rgVacaciones.check(radioButton.id)

    }

    fun onRadioCLicked(view:View){

        if (view is RadioButton){
            var checked = view.isChecked

            when(view.id){
                R.id.radioButton -> {
                    Toast.makeText(this,"Vamos a la playa",Toast.LENGTH_SHORT).show()
                }

                R.id.radioButton2 -> {
                    Toast.makeText(this,"Vamos a la montaña",Toast.LENGTH_SHORT).show()
                }
            }

        }
    }

}


