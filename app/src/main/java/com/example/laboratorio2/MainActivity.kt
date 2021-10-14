package com.example.laboratorio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        laboratorio2()
    }
    private fun laboratorio2(){

        val vehiculo = vehiculo1("nissan", "Rogue",2011)
        vehiculo.Listarvehiculo()

    }

}