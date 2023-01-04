package com.example.studykotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firePok = FirePokemo("Fogon",10f,100f)

        var waterPok = WaterPokemon("Hielo",69f,85f)


        batalla(firePok,waterPok)

        //subclases anidadas
        var sc = SubCLasses()
        println(sc.presentar())

        var ani = SubCLasses.Anidada()
        println(ani.presentar())

        //se crea el padre. porque internal esta haciendo uso de la variable padre
        var inn = SubCLasses().Interna()
        println(inn.prsentar())

        //objeto sin clase
        camilo.saludo()

        //data class
        var sol: Star = Star("Sol",696340f,"Via lactea")
        println(sol)

        var betelgeuse: Star = Star("Betelgeuse",617100000f,"Orion")
        betelgeuse.alive=false
        println(betelgeuse.alive)

        //enum class
        var hoy:Dias = Dias.LUNES
        var semena:Array<Dias> = Dias.values()

        for (day in semena) println(day)

        println(hoy.name)
        println(hoy.ordinal)

        println(hoy.Saludo())

        //anum class con paso de parametros
        println("el dia ${hoy.name} es kaboral? ${hoy.laboral}")

        var conEspacio:String = "Soy con espacio"

        println(conEspacio.noSPaces())

    }

    //Objetos anonimos. NO se han declarado las clases. se crean solo en el momento
    object camilo{
        var apodo = "Granda"
        fun saludo(){
            println("Hola me llaman ${apodo}")
        }
    }



    fun batalla(pokemonA: Pokemon, pokemonB: Pokemon){
        println("Batalla entre ${pokemonA.getName()} vs ${pokemonB.getName()}")

        pokemonA.attack()
        pokemonB.attack()
    }

    //funciones de extencion, es como agregar una funcionalidad a una clase, pero sin heredar
    private fun String.noSPaces():String{
        return this.replace(" ", "")
    }


}



