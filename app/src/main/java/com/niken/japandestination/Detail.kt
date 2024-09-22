package com.niken.japandestination

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Detail : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // Ambil data dari Intent
        val destinationName = intent.getStringExtra("destinationName")
        val destinationLocation = intent.getStringExtra("destinationLocation")
        val destinationDate = intent.getStringExtra("destinationDate")
        val destinationImageRes = intent.getIntExtra("destinationImageRes", 0)

        // Hubungkan dengan komponen UI di layout
        val textViewTitle: TextView = findViewById(R.id.textViewTitle)
        val textViewLocation: TextView = findViewById(R.id.textViewLocation)
        val imageView: ImageView = findViewById(R.id.imageView)
        val textViewDate: TextView = findViewById(R.id.textViewDestinationDateDetail)

        // Set data ke komponen UI
        textViewTitle.text = destinationName
        textViewLocation.text = "Lokasi : $destinationLocation"
        imageView.setImageResource(destinationImageRes)
        textViewDate.text = "Tanggal: $destinationDate"
    }
}
