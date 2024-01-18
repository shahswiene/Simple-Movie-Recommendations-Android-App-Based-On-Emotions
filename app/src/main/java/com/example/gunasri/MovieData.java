package com.example.gunasri;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    public static List<Movie> getMovieList() {
        List<Movie> movieList = new ArrayList<>();

        movieList.add(new Movie("Johnny English", "comedy", "happy", "6.2 / 10", "1h41m"));
        movieList.add(new Movie("The Sleep Over", "comedy", "happy", "5.7/10", "1h40m"));
        movieList.add(new Movie("Pitch Perfect", "comedy", "happy", "7.1 / 10", "1h52m"));
        movieList.add(new Movie("Clifford The Big Red Dog", "comedy", "happy", "5.9 / 10", "1h39m"));
        movieList.add(new Movie("Murder Mystery", "comedy", "happy", "6.0 / 10", "1h38m"));

        movieList.add(new Movie("The Gray Man", "action", "happy", "6.9/10", "2h9m"));
        movieList.add(new Movie("Mission Impossible", "action", "happy", "7.8 / 10", "2h43m"));
        movieList.add(new Movie("Top Gun: Maverick", "action", "happy", "8.3 / 10", "2h11m"));

        movieList.add(new Movie("Tenet", "sci-fi", "happy", "7.3 / 10", "2h30m"));
        movieList.add(new Movie("Inception", "sci-fi", "happy", "8.8 / 10", "2h28m"));
        movieList.add(new Movie("Black Adam", "sci-fi", "happy", "6.2 / 10", "2h5m"));
        movieList.add(new Movie("The Book of Eli", "sci-fi", "happy", "6.8 / 10", "1h58m"));
        movieList.add(new Movie("The Hunger Games", "sci-fi", "happy", "7.2 / 10", "2h22m"));

        movieList.add(new Movie("Underwater", "horror", "happy", "5.9 / 10", "1h35m"));
        movieList.add(new Movie("The Conjuring", "horror", "happy", "7.5 / 10", "1h52m"));
        movieList.add(new Movie("The Nun", "horror", "happy", "6.2 /10", "1h36m"));
        movieList.add(new Movie("The Mist", "horror", "happy", "7.1 / 10", "2h6m"));

        movieList.add(new Movie("The Platform", "thriller", "happy", "7.0 / 10", "1h34m"));
        movieList.add(new Movie("Gerald's Game", "thriller", "happy", "6.5 / 10", "1h43m"));
        movieList.add(new Movie("Panic Room", "thriller", "happy", "6.8 / 10", "1h52m"));
        movieList.add(new Movie("No Time To Die", "thriller", "happy", "7.3 / 10", "2h43m"));

        movieList.add(new Movie("Wonka", "fantasy", "sad", "7.3 / 10", "1h56m"));
        movieList.add(new Movie("Barbie", "fantasy", "sad", "7.0 / 10", "1h 54m"));
        movieList.add(new Movie("Elf", "fantasy", "sad", "7.1 /10", "1h53m"));
        movieList.add(new Movie("The Grinch", "fantasy", "sad", "6.4 / 10", "1h 25m"));
        movieList.add(new Movie("Candy Cane Lane", "fantasy", "sad", "6.0 / 10", "1h57m"));

        movieList.add(new Movie("Home Alone", "comedy", "sad", "7.7 / 10", "1h43m"));
        movieList.add(new Movie("The Family Plan", "comedy", "sad", "6.3 / 10", "1h58m"));
        movieList.add(new Movie("The Archies", "comedy", "sad", "5.2 / 10", "2h21m"));

        movieList.add(new Movie("Holidate", "holidays", "sad", "6.1 / 10", "1h44m"));
        movieList.add(new Movie("Jingle Jangle: A Christmas Journey", "holidays", "sad", "6.4 / 10", "1h59m"));
        movieList.add(new Movie("The Princess Switch", "holidays", "sad", "6.1 / 10", "1h46m"));
        movieList.add(new Movie("Holiday in the Wild", "holidays", "sad", "6.2 / 10", "1h26m"));

        movieList.add(new Movie("Spiderman Homecoming", "superhero", "angry", "7.4 / 10", "2h13m"));
        movieList.add(new Movie("Wonder Woman", "superhero", "angry", "7.4 / 10", "2h21m"));
        movieList.add(new Movie("Aquaman", "superhero", "angry", "6.8 / 10", "2h23m"));
        movieList.add(new Movie("Venom", "superhero", "angry", "6.6 / 10", "1h52m"));
        movieList.add(new Movie("Black Panther", "superhero", "angry", "7.3 / 10", "2h15m"));

        movieList.add(new Movie("Good Boys", "comedy", "angry", "6.7 / 10", "1h30m"));
        movieList.add(new Movie("Stuber", "comedy", "angry", "6.2 / 10", "1h33m"));
        movieList.add(new Movie("Game Night", "comedy", "angry", "6.9 / 10", "1h40m"));
        movieList.add(new Movie("Jumanji: Welcome to the Jungle", "comedy", "angry", "6.9 / 10", "1h49m"));

        movieList.add(new Movie("Godzilla Minus One", "horror", "angry", "8.4 / 10", "2h4m"));
        movieList.add(new Movie("A Haunting in Venice", "horror", "angry", "6.5 / 10", "1h43m"));
        movieList.add(new Movie("Thanksgiving", "horror", "angry", "6.6 / 10", "1h46m"));
        movieList.add(new Movie("X", "horror", "angry", "6.5 / 10", "1h45m"));
        movieList.add(new Movie("Talk to Me", "horror", "angry", "7.1 / 10", "1h35m"));

        movieList.add(new Movie("Enola Holmes", "mystery", "angry", "6.6 / 10", "2h3m"));
        movieList.add(new Movie("Zodiac", "mystery", "angry", "7.7 / 10", "2h37m"));
        movieList.add(new Movie("The Snowman", "mystery", "angry", "5.2 / 10", "1h59m"));
        movieList.add(new Movie("Gone Girl", "mystery", "angry", "8.1 / 10", "2h29m"));
        movieList.add(new Movie("Mystic River", "mystery", "angry", "7.9 / 10", "2h17m"));

        movieList.add(new Movie("The Proposal", "romance", "lovely", "6.7 / 10", "1h48m"));
        movieList.add(new Movie("Titanic", "romance", "lovely", "7.9 / 10", "3h30m"));
        movieList.add(new Movie("Five Feet Apart", "romance", "lovely", "8.3 / 10", "1h57m"));
        movieList.add(new Movie("The Mountain Between Us", "romance", "lovely", "6.6 / 10", "1h52m"));

        movieList.add(new Movie("Love Actually", "romantic comedy", "lovely", "6.4 / 10", "2h15m"));
        movieList.add(new Movie("27 Dresses", "romantic comedy", "lovely", "6.1 / 10", "1h59m"));
        movieList.add(new Movie("Just Go with It", "romantic comedy", "lovely", "6.4 / 10", "1h53m"));
        movieList.add(new Movie("Definitely Maybe", "romantic comedy", "lovely", "7.1 / 10", "1h58m"));

        movieList.add(new Movie("Family Switch", "family", "lovely", "5.6 / 10", "1h46m"));
        movieList.add(new Movie("Home Alone: Lost in New York", "family", "lovely", "6.9 / 10", "2h"));
        movieList.add(new Movie("Wish", "family", "lovely", "5.8 / 10", "1h53m"));
        movieList.add(new Movie("The Lion King", "family", "lovely", "8.5 / 10", "1h27m"));

        movieList.add(new Movie("Ted", "friends", "lovely", "6.9 / 10", "1h46m"));
        movieList.add(new Movie("The Breakfast Club", "friends", "lovely", "7.8 / 10", "1h37m"));
        movieList.add(new Movie("Toy Story", "friends", "lovely", "8.3 / 10", "1h29m"));
        movieList.add(new Movie("Joy Ride", "friends", "lovely", "6.4 / 10", "1h35m"));

        movieList.add(new Movie("Trolls", "Adventure", "Anxious", "6.0 / 10", "1h4m"));
        movieList.add(new Movie("Doctor Who", "Adventure", "Anxious", "8.6 / 10", "2h"));
        movieList.add(new Movie("Napoleon", "Adventure", "Anxious", "6.6 / 10", "2h38m"));
        movieList.add(new Movie("Game of Thrones", "Adventure", "Anxious", "9.2 / 10", "8 seasons"));
        movieList.add(new Movie("Kungfu Panda", "Adventure", "Anxious", "7.6 / 10", "1h32m"));

        movieList.add(new Movie("Yes Man", "Self help", "Anxious", "6.8 / 10", "1h44m"));
        movieList.add(new Movie("A Beautiful Mind", "Self help", "Anxious", "8.2 / 10", "2h15m"));
        movieList.add(new Movie("Pay it forward", "Self help", "Anxious", "7.2 / 10", "2h3m"));
        movieList.add(new Movie("The Social Network", "Self help", "Anxious", "7.8 / 10", "2h"));

        movieList.add(new Movie("Charlie and Chocolate Story", "Family", "Anxious", "6.7 / 10", "1h55m"));
        movieList.add(new Movie("Daddy Day Care", "Family", "Anxious", "5.6 / 10", "1h32m"));
        movieList.add(new Movie("A Christmas Story", "Family", "Anxious", "7.9 / 10", "1h34m"));
        movieList.add(new Movie("Despicable me", "Family", "Anxious", "7.6 / 10", "1h35m"));
        movieList.add(new Movie("The Willoughbys", "Family", "Anxious", "6.4 / 10", "1h32m"));

        return movieList;
    }
}
