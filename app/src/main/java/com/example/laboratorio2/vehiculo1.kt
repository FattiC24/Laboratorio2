package com.example.laboratorio2

class vehiculo1(val marca:String, val modelo:String, val anio:Int):manejar(),vehiculo{

    fun Listarvehiculo(){
        println("vehiculo $marca, modelo: $modelo, anio: $anio")
        saludo1()
        manejar()
    }

    override fun saludo1() {
        println("Vehiculo adquidido: $marca")
    }

    override fun manejar() {
        println("Conduciendo auto $marca $modelo $anio")
    }
}