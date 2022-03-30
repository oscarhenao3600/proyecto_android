package com.example.primer_proyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val miBoton:Button=findViewById(R.id.btnIngresar)
        miBoton.setOnClickListener{onClick()}
    }

    private fun onClick(){
        val campoTexto:EditText=findViewById(R.id.editTextTextPersonName)
        val nombre:String=campoTexto.text.toString()
        val campoEdad:EditText=findViewById(R.id.edad)
        val edad:Int=campoEdad.text.toString().toInt()

        val txtResutado:TextView=findViewById(R.id.txtResultado)
        txtResutado.text="Bienvenido $nombre su edad es: $edad "
        if ((edad>0)&&(edad<16))
        {
            txtResutado.text="Con la edad de :$edad esta en el rango de Infante "
        }
        if ((edad>15)&&(edad<19))
        {
            txtResutado.text="Con la edad de :$edad esta en el rango de Adolecente "
        }
        if ((edad>18)&&(edad<66))
        {
            txtResutado.text="Con la edad de :$edad esta en el rango de Adulto "
        }
        if (edad>65)
        {
            txtResutado.text="Con la edad de :$edad esta en el rango de Adulto mayor "
        }

    }
}