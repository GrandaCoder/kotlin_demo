package com.example.studykotlin

//aqui se crea el constructor
class Person(var nombre:String = "NN", var passport:String? = null,var height:Float =1.60f) {
    //aqui van los atributos y métodos
    private var alive: Boolean = true

    //métodos
    fun cambiarNombre(){
        nombre = "Carl"
    }

    fun die(){
        alive = false
    }
/*
    fun checkPolicia( fn : (Float)-> Boolean):Boolean{
        return  fn(height)
    }
*/
}