package com.example.gunasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AngryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angry);

        setupButton(R.id.button_comedy, "comedy");
        setupButton(R.id.button_horror, "horror");
        setupButton(R.id.button_mystery, "mystery");
        setupButton(R.id.button_superhero, "superhero");
    }

    private void setupButton(int buttonId, final String genre) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AngryActivity.this, MovieActivity.class);
                intent.putExtra("MOOD", "angry");
                intent.putExtra("GENRE", genre);
                startActivity(intent);
            }
        });
    }
}
