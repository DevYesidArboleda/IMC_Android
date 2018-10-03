package com.example.yesid.imc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var imc :Float=0F

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txt_peso=findViewById<EditText>(R.id.txt_peso)
        var txt_altura=findViewById<EditText>(R.id.txt_altura)

        btn1.setOnClickListener { calcular() }
    }

    fun calcular(){

        val peso = Integer.parseInt(txt_peso.text.toString())
        val altura = java.lang.Float.parseFloat(txt_altura.text.toString())

        imc= peso / (altura * altura)

        when (imc){
            in 1..16 ->{
                textView.text= "Usted posee degaldez severa"
                textView2.text="$imc"
            }
            in 16.1..16.99 ->{
                textView.text= "Usted posee degaldez moderada"
                textView2.text="$imc"
            }
            in 17.0..18.0 ->{
                textView.text= "Usted posee degaldez aceptable"
                textView2.text="$imc"
            }
            in 18.1..24.99 ->{
                textView.text= "Usted posee un peso normal"
                textView2.text="$imc"
            }
            in 25.0 .. 29.99 -> {
                textView.text= "Usted posee sobrepeso "
                textView2.text="$imc"
            }
            in 30.0 .. 34.99-> {
                textView.text= "Usted posee sobrepeso tipo 1 "
                textView2.text="$imc"
            }
            in 35.0 .. 39.99 ->{
                textView.text= "Usted posee sobrepeso tipo 2"
                textView2.text="$imc"
            }
            in 40 .. 100->{
                textView.text= "Usted posee sobrepeso tipo 3"
                textView2.text="$imc"
            }
        }
    }

}
