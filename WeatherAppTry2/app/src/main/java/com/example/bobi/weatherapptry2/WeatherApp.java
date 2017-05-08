package com.example.bobi.weatherapptry2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Typeface;
import android.text.Html;
import android.widget.TextView;

public class WeatherApp extends AppCompatActivity {


    TextView cityField, detailsField, currentTemperatureField, humidity_field, pressure_field, weatherIcon, updatedField;

    Typeface weatherFont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_app);

        weatherFont = Typeface.createFromAsset(getAssets(),"fonts/weathericons-regular-webfont.ttf");

        cityField = (TextView)findViewById(R.id.city_field);
        updatedField = (TextView)findViewById(R.id.updated_field);
        detailsField = (TextView) findViewById(R.id.details_field);

    }
}
