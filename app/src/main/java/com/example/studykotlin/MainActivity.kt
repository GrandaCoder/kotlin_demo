package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //--------- try catch finally

        /*
         Errores mas comunes

        * NullPointerException -> por ejemplo se ejecuta un objeto que no existe
        *
        *ArithmeticException -> por ejemplo dividir por cero
        *
        * Security Exception -> acceder un archivo sin permiso
        *
        * ArrayIndexOutBoundException -> una posicion de u array que no existe
        *
        * */

        var a = 8
        var b = 2

        println(valueTrain(a,b))

    }

    private fun valueTrain(numberA:Int, numberB:Int):Any {

       var respuesta = try {
           /*
                Lineas de código

            Y por ultimo la instruccion
           */
           println("division $numberA / $numberB")

            numberA/numberB

        }catch (e:Exception){
            // DIVISION NO PERMITIDA

            "Accion no permitida"
        }
        return respuesta
    }

}



