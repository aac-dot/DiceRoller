package com.google.akf.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.akf.diceroller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.rollButton.setOnClickListener{ rollDice() }
    }

    private fun rollDice() {
        val diceImage1 = binding.diceImage1
        val diceImage2 = binding.diceImage2

        diceImage1.setImageResource(randomRollDice())
        diceImage2.setImageResource(randomRollDice())
    }

    private fun randomRollDice() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
    /*
    private fun countUp() {
        val resultText = binding.emptyDiceImage

        if (resultText.text.equals("Hello World")) {
            resultText.text = "1"
        } else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt += 1
                resultText.text = resultInt.toString()
            }
        }
    }

    */
}