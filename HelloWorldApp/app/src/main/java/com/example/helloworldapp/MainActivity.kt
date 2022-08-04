package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView


// This Kotlin file takes care of user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // connects the layout file and XML file
        setContentView(R.layout.activity_main)

        // Get a reference to button
        findViewById<Button>(R.id.button).setOnClickListener {
            // Handle the button tap
            // Change the color of text
            Log.i("Teghpreet", "Tapped on Button")
            // get a reference to the text view
            // set the color of the text view
            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))

        }
    }
}