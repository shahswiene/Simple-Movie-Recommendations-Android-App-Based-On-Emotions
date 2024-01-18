package com.example.gunasri;

public class Movie {
    private String title;
    private String genre;
    private String mood;
    private String rating;
    private String duration;

    public Movie(String title, String genre, String mood, String rating, String duration) {
        this.title = title;
        this.genre = genre;
        this.mood = mood;
        this.rating = rating;
        this.duration = duration;
    }

    // Getters
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getMood() { return mood; }
    public String getRating() { return rating; }
    public String getDuration() { return duration; }
}
