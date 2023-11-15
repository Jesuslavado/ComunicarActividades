package com.example.comunicaractividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        val binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bacceder.setOnClickListener{
           var nombre= binding.nombre.text.toString()

            // CREAMOS INTENT PARA COMUNICAR CON LA PANTALLA 2
            var intent= Intent(this,Pantalla_2::class.java)

            intent.putExtra("dato", nombre)

            startActivity(intent)

        }
        // RECOGEMOS LA INFORMACION DE LA PANTALLA 2
        val extras= intent.extras
        val s= extras?.getString("datos")?:"Error"

        binding.info.text=s
    }
}