package com.example.studykotlin

import android.annotation.SuppressLint

//utilizamos protected para que los hijos puedan utilizarlo
open class Pokemon(protected var name:String, protected var attack: Float, protected var life:Float): Agradecer() {

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

class FirePokemo(name: String,attack: Float,life: Float): Pokemon(name, attack, life),DecirAdios{

    //esto es para asignarle valores mas tarde
    lateinit var ballFire: BallFire
    var numeroDeBolas: Int = 0

    fun respirar(){
        println("EL ${name} está Respirando....")
    }


    override fun attack() {

        //con super ejecutamos la funcion del padre
        super.attack()
        println("EL ${name} Ataca con bola${++numeroDeBolas} de fuego")

        //inicianmos la bola
        ballFire = BallFire()
        ballFire.arrojarBola()
    }

}

//colaboracion entre clases
class BallFire(t:Int = 100){

    fun arrojarBola(){
        println("Arrojando la bola")
    }
}





//esto es algo que se usan pero no se instancias objetos de esta clase, solo se heredan los metodos
abstract class Agradecer(){
    fun decirGracias(){
        println("Gracias")
    }
}

//desde interface podemos decir que deben tener los objetos, es como una herencia
interface DecirAdios{

    fun bye() {
        println("Adios desde interace")
    }
}