package com.example.messageshareapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.messageshareapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShowToast.setOnClickListener {
            Log.i("Main Activity", "Toast Button was clicked")
            Toast.makeText(this, "Button was clicked !!", Toast.LENGTH_LONG).show()
        }
        binding.btnSendMsgToNextActivity.setOnClickListener {
            val message: String = binding.etUserMessage.text.toString()
            Toast.makeText(this,  message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)
        }

        binding.btnShareToOtherApps.setOnClickListener {
            val message: String = binding.etUserMessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share WithHe : "))
        }

        binding.btnRecyclerviewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
        }

        
    }
}