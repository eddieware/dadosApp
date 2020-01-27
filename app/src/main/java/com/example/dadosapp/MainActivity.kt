package com.example.dadosapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    //parte del video

    //

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myBtn = findViewById<Button>(R.id.myBtn) //definiendo como variable mybtn
        var myTxt = findViewById<TextView>(R.id.myTxt)// definiendo como variable mytextview
        //var myImgView =findViewById<ImageView>(R.id.myImgView)
        var myRandomInt : Int? = null //
        var imagesdado : ImageView? = null // el optional es para no destapar image view ya que de lo contrario tengo que inicializarlo



        // Evento para tocar el boton
        myBtn.setOnClickListener(){
            var myRandomInt = Random.nextInt(from = 1, until = 6) // limites del random
            myTxt.text = "i have $myRandomInt" //propiedad text para imprimir el random en pantalla
            //println(myRandomInt)
            val drawableResource = when (myRandomInt){ //igualando drawable resource al random
                // asignando una imagen al random
                1 -> R.drawable.cara1
                2 -> R.drawable.cara2
                3 -> R.drawable.cara3
                4 -> R.drawable.cara4
                5 -> R.drawable.cara5
                else -> R.drawable.cara6 // lleva el else para finalizar
            }

            imagesdado?.setImageResource(drawableResource) //asignando el recurso a imagesdado
            println(myRandomInt)

        }
        imagesdado = findViewById(R.id.myImgView) //Sacando por el image View lo almacenando en images dado





        //textView.text = "i have $myRandomInt"

    }

}
