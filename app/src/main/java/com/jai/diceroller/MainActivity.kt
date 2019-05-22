package com.jai.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
       diceImage = findViewById(R.id.dice_image)
        val resultText: TextView = findViewById(R.id.result_text)
        rollButton.setOnClickListener{
            rollDice()

        }
    }

    fun rollDice(){

        val randomInt = Random().nextInt(6)+1
        result_text.text = randomInt.toString()

        var drawableResource = when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        }

        dice_image.setImageResource(drawableResource)

    }
}
