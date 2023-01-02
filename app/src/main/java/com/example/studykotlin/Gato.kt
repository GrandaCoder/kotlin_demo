package com.example.studykotlin

open class Animal(var name: String, var age: Int) {
    open fun makeSound() {
        println("Hace algún sonido...")
    }
}

class Gato(name: String, age: Int,var  color: String, var pelo: String) : Animal(name, age) {
    override fun makeSound() {
        println("Miau")
    }

   fun getColorCat():String{
       return color;
   }

}
