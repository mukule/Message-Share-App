package com.example.messageshareapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.messageshareapp.databinding.ActivityHobbiesBinding

class HobbiesActivity : AppCompatActivity(){
    private lateinit var binding: ActivityHobbiesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHobbiesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}