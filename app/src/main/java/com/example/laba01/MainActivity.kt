package com.example.laba01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ex = numberExercise()
        val Numbers = findViewById<TextView>(R.id.Numbers)
            Numbers.text = ex.getNums()
        val Sum = findViewById<TextView>(R.id.Sum)
        val Count = findViewById<TextView>(R.id.Count)
        val Button = findViewById<Button>(R.id.Button)

        Button.setOnClickListener {
            Sum.text = ex.getNegativeSum()
            Count.text = ex.getPositiveCount()
        }
    }
}