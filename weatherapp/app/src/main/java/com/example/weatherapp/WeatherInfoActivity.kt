package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WeatherInfoActivity : AppCompatActivity() {

    private lateinit var weatherInfoTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_info)

        weatherInfoTextView = findViewById(R.id.weather_info)

        val cityName = intent.getStringExtra("CITY_NAME")
        val weatherInfo = "Weather info for $cityName"

        weatherInfoTextView.text = weatherInfo

        val displayWeatherIntent = Intent(this, DisplayWeatherActivity::class.java).apply {
            putExtra("WEATHER_INFO", weatherInfo)
        }
        startActivity(displayWeatherIntent)
    }
}
