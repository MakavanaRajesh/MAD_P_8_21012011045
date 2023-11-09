package com.example.mad_practical_8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.WindowCompat
import com.example.mad_practical_8.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        binding.cardListAlarm.visibility = View.GONE
        binding.btnCreareAlarm.setOnClickListener { if View
            showTimarDialog()
        }
        binding.btnCrateAlarm.setOnClickListener{ if View!
            setAlarm(-1,str:"Stop")
            binding:

        }
        setContentView(R.layout.activity_main)
    }
}