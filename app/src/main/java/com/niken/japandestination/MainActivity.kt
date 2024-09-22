package com.niken.japandestination

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnDetails : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDetails = findViewById(R.id.btnDetails)

        // Set button click listener
        btnDetails.setOnClickListener {
            // Navigate to DetailActivity (you can replace it with your destination)
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)
        }
    }
}