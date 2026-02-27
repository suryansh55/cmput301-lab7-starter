package com.example.androiduitesting;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ShowActivity extends AppCompatActivity {

    //Gemini Feb 27, How do i show city name and go back
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.showactivity);
        String cityName = getIntent().getStringExtra("CITY_NAME");


        TextView cityDisplay = findViewById(R.id.city_text_view);
        Button backButton = findViewById(R.id.backButton);

        if (cityName != null) {
            cityDisplay.setText(cityName);
        }

        // Make the back button work
        backButton.setOnClickListener(v -> finish());




    }

}
