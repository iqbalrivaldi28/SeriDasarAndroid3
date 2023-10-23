package com.example.seridasarandroid3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.example.seridasarandroid3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHapus.visibility = View.GONE

        // Button Jumlah
        binding.btnJumlah.setOnClickListener {
            count++
            binding.tvAngka.setText("Jumlah Angka: $count")
            updateVisibilityButtonHapus()
        }

        // Button Hapus
        binding.btnHapus.setOnClickListener {
            count = 0
            binding.tvAngka.setText("Jumlah Angka: $count")
            updateVisibilityButtonHapus()
        }
    }

    // Fungsi Update Visibility Button
    private fun updateVisibilityButtonHapus() {
        if (count == 0){
            binding.btnHapus.visibility = View.GONE
        } else {
            binding.btnHapus.visibility = View.VISIBLE
        }
    }

}