package com.niken.japandestination.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.niken.japandestination.Detail
import com.niken.japandestination.R
import com.niken.japandestination.model.DestinationModel

class DestinationAdapter(private val destinations: List<DestinationModel>) :
    RecyclerView.Adapter<DestinationAdapter.DestinationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_destination, parent, false)
        return DestinationViewHolder(view)
    }

    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val destination = destinations[position]
        holder.bind(destination)
    }

    override fun getItemCount(): Int {
        return destinations.size
    }

    class DestinationViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView: ImageView = view.findViewById(R.id.imageViewDestination)
        private val textViewName: TextView = view.findViewById(R.id.textViewDestination)
        private val textViewLocation: TextView = view.findViewById(R.id.textViewLocation)

        // Bind data dan set click listener
        fun bind(destination: DestinationModel) {
            imageView.setImageResource(destination.imageRes)
            textViewName.text = destination.name
            textViewLocation.text = destination.location

            // Set OnClickListener untuk pindah ke DetailActivity
            itemView.setOnClickListener {
                val context = it.context
                val intent = Intent(context, Detail::class.java).apply {
                    putExtra("destinationName", destination.name)
                    putExtra("destinationLocation", destination.location)
                    putExtra("destinationImageRes", destination.imageRes)
                    putExtra("destinationDate", destination.date)
                }
                context.startActivity(intent)
            }
        }
    }
}
