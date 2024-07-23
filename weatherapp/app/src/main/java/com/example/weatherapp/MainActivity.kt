package com.example.weatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var cityNameEditText: EditText
    private lateinit var getWeatherButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cityNameEditText = findViewById(R.id.city_name)
        getWeatherButton = findViewById(R.id.get_weather_button)

        getWeatherButton.setOnClickListener {
            val cityName = cityNameEditText.text.toString()
            val weatherInfoIntent = Intent(this, WeatherInfoActivity::class.java).apply {
                putExtra("CITY_NAME", cityName)
            }
            startActivity(weatherInfoIntent)
        }
    }
}
