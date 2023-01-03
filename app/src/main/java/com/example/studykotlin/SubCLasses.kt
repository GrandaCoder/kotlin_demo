package com.example.studykotlin

class SubCLasses {
    private var name = "pedro"

    fun presentar():String {
        return name
    }

    //una clase dentro de otra clase. CLase anidada. Para acceder usamos SubClasses.Anidada()
    class Anidada{
        private val nameAnidada = "Anidada"

        fun presentar(): String {
            return nameAnidada
        }
    }

    inner class Interna{
        private val nameInterna = "Interna"
        fun prsentar(): String{
            return "Hola, soy ${this.nameInterna}, hija de ${name}"
        }
    }


}