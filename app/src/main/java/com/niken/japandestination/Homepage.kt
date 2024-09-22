package com.niken.japandestination

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.niken.japandestination.adapter.DestinationAdapter
import com.niken.japandestination.model.DestinationModel

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homepage)

        val recyclerViewDestination = findViewById<RecyclerView>(R.id.recyclerViewDestination)

        val destinations = listOf(
            DestinationModel("Sensoji Temple", "Asakusa", R.drawable.sensoji, "20 September 2024"),
            DestinationModel("Temple", "Tokyo", R.drawable.image_1, "21 September 2024"),
            DestinationModel("Sensoji Temple", "Asakusa", R.drawable.sensoji, "22 September 2024"),
            DestinationModel("Temple", "Tokyo", R.drawable.image_1, "23 September 2024")
        )

        recyclerViewDestination.layoutManager = GridLayoutManager(this, 2)
        recyclerViewDestination.adapter = DestinationAdapter(destinations)
    }

}

