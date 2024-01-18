package com.example.gunasri;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MovieActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        String mood = getIntent().getStringExtra("MOOD");
        String genre = getIntent().getStringExtra("GENRE");

        List<Movie> filteredMovies = filterMovies(mood, genre);

        recyclerView = findViewById(R.id.recyclerView_movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MovieAdapter(filteredMovies);
        recyclerView.setAdapter(adapter);
    }

    private List<Movie> filterMovies(String mood, String genre) {
        List<Movie> allMovies = MovieData.getMovieList();
        List<Movie> filteredList = new ArrayList<>();

        for (Movie movie : allMovies) {
            if (movie.getMood().equalsIgnoreCase(mood) && movie.getGenre().equalsIgnoreCase(genre)) {
                filteredList.add(movie);
            }
        }

        return filteredList;
    }
}
