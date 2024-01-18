package com.example.gunasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class AnxiousActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anxious);

        setupButton(R.id.button_adventure, "adventure");
        setupButton(R.id.button_self_help, "self help");
        setupButton(R.id.button_family, "family");
    }

    private void setupButton(int buttonId, final String genre) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AnxiousActivity.this, MovieActivity.class);
                intent.putExtra("MOOD", "anxious");
                intent.putExtra("GENRE", genre);
                startActivity(intent);
            }
        });
    }
}
