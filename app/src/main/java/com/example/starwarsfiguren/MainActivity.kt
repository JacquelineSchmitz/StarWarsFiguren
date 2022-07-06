package com.example.starwarsfiguren

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.starwarsfiguren.adapter.FigurenAdapter
import com.example.starwarsfiguren.data.Datasource
import com.example.starwarsfiguren.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


    binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
                val figurenListe = Datasource().loadFiguren()
                binding.recyclerView.adapter = FigurenAdapter(this, figurenListe)
                binding.recyclerView.setHasFixedSize(true)

    }
}