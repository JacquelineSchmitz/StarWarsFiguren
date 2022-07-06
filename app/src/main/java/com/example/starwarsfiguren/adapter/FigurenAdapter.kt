package com.example.starwarsfiguren.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.starwarsfiguren.data.model.Figuren
import com.example.starwarsfiguren.databinding.CardBinding

class FigurenAdapter (


    private val context: Context,
    private val dataset: List<Figuren>
): RecyclerView.Adapter<FigurenAdapter.ItemViewHolder>() {

    class ItemViewHolder(val binding: CardBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = CardBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]

        holder.binding.imageVader.setImageResource(item.pictureResource)
        holder.binding.textViewDarthvader.text = item.name
        holder.binding.textView2PreisVader.text = "€${item.preis}"

    }



    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}




