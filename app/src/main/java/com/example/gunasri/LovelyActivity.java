package com.example.gunasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LovelyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lovely);

        setupButton(R.id.button_romance, "romance");
        setupButton(R.id.button_romantic_comedy, "romantic comedy");
        setupButton(R.id.button_family, "family");
        setupButton(R.id.button_friends, "friends");
    }

    private void setupButton(int buttonId, final String genre) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LovelyActivity.this, MovieActivity.class);
                intent.putExtra("MOOD", "lovely");
                intent.putExtra("GENRE", genre);
                startActivity(intent);
            }
        });
    }
}
