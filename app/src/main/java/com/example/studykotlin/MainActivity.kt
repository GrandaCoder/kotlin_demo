package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //aqui podemos observar de que lo que etsá al lado de intarray es una lambda
        var array = IntArray(8){5}
        for (i in array)
            println(i)

        var array2 = IntArray(8){it} // it de iterador 01,2,3,....n

        var array3 = IntArray(8){it *2} //multiplica los valores por 2 arroja 2,4,8,16

        var array4 = IntArray(8){i -> i*3} //multiplica los valores por 3 arroja 3,,6,9

    }

}



