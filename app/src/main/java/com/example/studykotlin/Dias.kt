package com.example.studykotlin

//adimte metodos y atributos... pero los atributos son constantes
enum class Dias(val laboral:Boolean,val jornada:Int){
    LUNES(true,8),MARTES(true,8),MIERCOLES(true,8),JUEVES(true,8),VIERNES(true,8),SABADO(false,5),DOMINGO(false,0);

    fun Saludo():String {
        when(this){
            LUNES -> return "empezando con alegria el lunes"
            MARTES -> return "empezando con alegria martes :0"
            MIERCOLES -> return "empezando con alegria miercoles"
            JUEVES -> return "empezando con alegria jueves --"
            VIERNES -> return "empezando con alegria viernes "
            SABADO -> return "empezando con alegria sabado"
            DOMINGO -> return "empezando con alegria domingo"
            else -> return "otro dia raro"
        }
    }
}