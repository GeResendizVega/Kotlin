package com.example.miaplicacion101.ejercicios

fun main(){

    var nombreDeVariable = "Mi Variable"
    var edad: Int = 35;
    var altura : Double = 1.75
    var esEstudiante: Boolean = true

    println("Mi nombre es  $nombreDeVariable")

    /**
    * for rango de numero
     * */
    for (i in 0..10){
        print (" $i ")
    }

    val myArray = arrayOf("manzana","pera","platano","fresa","mango")

    for (item in myArray){
        println(item)
    }

    if(edad >= 18){
        println("es mayor de edad ")

    }else{
        println("soy menor de edad ")
    }

    imprimeResultado(8.5)

    var nombre : String? = null
    var nombre2 :String = "Juan"

    println(nombre?.length)
    println(nombre2.length)


}

fun imprimeResultado(prom:Double){
    when{
        prom >= 9.0 -> println("Excelente")
        prom >= 7.0 -> println("Muy Bien ")
        prom >= 5.0 -> println("Bien")
        else ->println("reprobado")

    }

}
