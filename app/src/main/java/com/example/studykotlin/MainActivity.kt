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

        //toggle
        var tgNormal = findViewById<ToggleButton>(R.id.toggleButton)
        tgNormal.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                Toast.makeText(this,"Activado",Toast.LENGTH_SHORT).show()
            }
        }


    }


}


