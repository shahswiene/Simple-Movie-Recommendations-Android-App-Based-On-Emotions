package com.example.gunasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HappyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        // Setup buttons and listeners
        setupButton(R.id.button_comedy, "comedy");
        setupButton(R.id.button_action, "action");
        setupButton(R.id.button_scifi, "sci-fi");
        setupButton(R.id.button_horror, "horror");
        setupButton(R.id.button_thriller, "thriller");
    }

    private void setupButton(int buttonId, final String genre) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start MovieActivity with the mood 'happy' and selected genre
                Intent intent = new Intent(HappyActivity.this, MovieActivity.class);
                intent.putExtra("MOOD", "happy");
                intent.putExtra("GENRE", genre);
                startActivity(intent);
            }
        });
    }
}
