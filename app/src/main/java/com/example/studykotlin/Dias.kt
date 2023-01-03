package com.example.studykotlin

//adimte metodos y atributos... pero los atributos son constantes
enum class Dias {
    LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO;

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