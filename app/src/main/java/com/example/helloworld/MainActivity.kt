package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var incrementNumber: Int = 0

        val buttonIncrement = findViewById<Button>(R.id.button_increment)
        val incrementTextView = findViewById<TextView>(R.id.increment_textView)

        buttonIncrement.setOnClickListener {
            incrementNumber++

            incrementTextView.text=  incrementNumber.toString()
        }



    }
}