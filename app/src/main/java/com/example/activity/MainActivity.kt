package com.example.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn =findViewById<Button>(R.id.BtnNext)
            btn.setOnClickListener {
                val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            }

    }
}