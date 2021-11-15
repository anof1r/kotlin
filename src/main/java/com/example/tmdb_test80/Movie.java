package com.example.tmdb_test80;

public class Movie {
    int id;
    double vote_average;
    String original_title;
    String overview;


    @Override
    public String toString(){
        return "Movie: " + original_title +
                "\n Id = " + id +
                "\n Vote average = " + vote_average +
                "\n overview = " + overview;
    }
}
