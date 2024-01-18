package com.example.gunasri;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sad);

        setupButton(R.id.button_fantasy, "fantasy");
        setupButton(R.id.button_comedy, "comedy");
        setupButton(R.id.button_holidays, "holidays");
    }

    private void setupButton(int buttonId, final String genre) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SadActivity.this, MovieActivity.class);
                intent.putExtra("MOOD", "sad");
                intent.putExtra("GENRE", genre);
                startActivity(intent);
            }
        });
    }
}
