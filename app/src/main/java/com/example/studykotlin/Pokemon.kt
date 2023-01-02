package com.example.studykotlin

import android.annotation.SuppressLint

//utilizamos protected para que los hijos puedan utilizarlo
open class Pokemon(protected var name:String, protected var attack: Float, protected var life:Float) {

    //metodos getters

    // Para usar protected hay que hacer uso de internal en la funcion
    internal fun getName():String{
        return name
    }
    internal fun getAttack():Float{
        return attack
    }
    internal fun getLife():Float{
        return life
    }

    //setters
    internal fun setLife(life:Float){
        this.life = life
    }

     open fun attack() {
        println("EL ${name} Ataca generico")
    }
}

class WaterPokemon(name: String,attack: Float,life: Float): Pokemon(name, attack, life){

    fun respirar(){
        println("EL ${name} está Respirando....")
    }

}

class FirePokemo(name: String,attack: Float,life: Float): Pokemon(name, attack, life){

    fun respirar(){
        println("EL ${name} está Respirando....")
    }


    override fun attack() {

        //con super ejecutamos la funcion del padre
        super.attack()
        println("EL ${name} Ataca con fuegooo")
    }

}