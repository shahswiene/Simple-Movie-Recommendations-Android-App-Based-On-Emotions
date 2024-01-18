package com.example.gunasri;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder> {

    private final List<Movie> movies;

    public MovieAdapter(List<Movie> movies) {
        this.movies = movies;
    }

    @NonNull
    @Override
    public MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_item, parent, false);
        return new MovieViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieViewHolder holder, int position) {
        Movie movie = movies.get(position);
        holder.bind(movie);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    static class MovieViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, genreTextView, moodTextView, ratingTextView, durationTextView;

        public MovieViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.textView_title);
            genreTextView = itemView.findViewById(R.id.textView_genre);
            moodTextView = itemView.findViewById(R.id.textView_mood);
            ratingTextView = itemView.findViewById(R.id.textView_rating);
            durationTextView = itemView.findViewById(R.id.textView_duration);
        }

        public void bind(Movie movie) {
            titleTextView.setText(movie.getTitle());
            genreTextView.setText(movie.getGenre());
            moodTextView.setText(movie.getMood());
            ratingTextView.setText(movie.getRating());
            durationTextView.setText(movie.getDuration());
        }
    }
}
