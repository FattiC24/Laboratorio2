package com.example.laboratorio2

class vehiculo1 (val marca:String, val modelo:String, val anio:Int):vehiculo{

    fun listarvehiculo{
        println("vehiculo $marca, modelo: $modelo, anio: $anio")
        saludo1()
    }

    override fun saludo1() {
        println("Venihuculo adquidido: $marca")
    }
    private fun conducir(){
        println("Vehiculo conducido $marca")
    }
}