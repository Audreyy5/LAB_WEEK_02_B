package com.example.lab_week_02_b

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val colorCode = intent.getStringExtra(MainActivity.COLOR_KEY)
        val background = findViewById<ConstraintLayout>(R.id.background_screen)
        val resultText = findViewById<TextView>(R.id.color_code_result_message)

        try {
            background.setBackgroundColor(Color.parseColor("#$colorCode"))
            resultText.text = "Color code #$colorCode is applied!"
        } catch (e: IllegalArgumentException) {
            resultText.text = "Invalid color code!"
        }
    }
}
