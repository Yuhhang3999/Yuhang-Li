package com.example.weatherapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DisplayWeatherActivity : AppCompatActivity() {

    private lateinit var displayWeatherTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_weather)

        displayWeatherTextView = findViewById(R.id.display_weather)

        val weatherInfo = intent.getStringExtra("WEATHER_INFO")
        displayWeatherTextView.text = weatherInfo
    }
}
