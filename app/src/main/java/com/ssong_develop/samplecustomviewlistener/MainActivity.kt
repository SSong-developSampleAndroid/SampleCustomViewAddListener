package com.ssong_develop.samplecustomviewlistener

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = findViewById<CustomView>(R.id.test)

        view.setOnCustomViewClickListener {
            Log.d("ssong-develop","click invoke!!")
        }
    }
}