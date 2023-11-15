package com.example.comunicaractividades

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.comunicaractividades.databinding.ActivityPantalla2Binding

class Pantalla_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_pantalla2)
        val binding= ActivityPantalla2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // RECOGEMOS LA INFORMACION EN UNA VARIABLE EXTRAS
        val extras= intent.extras

        // AMACENAMOS EN S EL DATO RECIBIDO
        val s = extras?.getString("dato","sin nombre")?: "sin nombre"

        // MOSTRAMO LA INFORMACION
        binding.Bienvenida.text= "Binenvenido , $s ,  ¿Acepta los terminos?"

        // EN CASO DE QUE PULSEMOS SOBRE EL BOTON ACEPTAR, ENVIAMOS LOS DATOS A LA
        // MAINACTIVITY
        binding.baceptar.setOnClickListener{
            var intent = Intent(this, MainActivity:: class.java)
            intent.putExtra("dato", "Ha aceptado los terminos")

            startActivity(intent)
        }

        binding.brechazar.setOnClickListener{
            var intent = Intent(this, MainActivity:: class.java)
            intent.putExtra("dato", "Ha rechazado los terminos")

            startActivity(intent)
        }
    }
}