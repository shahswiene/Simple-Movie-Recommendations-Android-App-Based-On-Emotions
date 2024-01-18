package com.example.gunasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class FeelingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feeling);

        // Initialize buttons
        Button buttonHappy = findViewById(R.id.button_happy);
        Button buttonSad = findViewById(R.id.button_sad);
        Button buttonAngry = findViewById(R.id.button_angry);
        Button buttonLovely = findViewById(R.id.button_lovely);
        Button buttonAnxious = findViewById(R.id.button_anxious);

        // Set onClick listeners
        buttonHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingActivity.this, HappyActivity.class);
                startActivity(intent);
            }
        });

        buttonSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingActivity.this, SadActivity.class);
                startActivity(intent);
            }
        });

        buttonAngry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingActivity.this, AngryActivity.class);
                startActivity(intent);
            }
        });

        buttonLovely.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingActivity.this, LovelyActivity.class);
                startActivity(intent);
            }
        });

        buttonAnxious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FeelingActivity.this, AnxiousActivity.class);
                startActivity(intent);
            }
        });
    }
}
