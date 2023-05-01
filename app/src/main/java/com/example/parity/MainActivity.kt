package com.example.parity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import parity.parity.Parity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var x = findViewById<TextView>(R.id.txtView)
        x.text = Parity.getParity(5)
    }
}