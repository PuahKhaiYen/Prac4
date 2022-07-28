package com.example.prac4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btnCall)

        btn.setOnClickListener() {
            var number = Uri.parse("tel:999")
            var intent = Intent(Intent.ACTION_DIAL, number)

            startActivity(intent)
        }
    }
}