package com.example.tmdb_test80;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Controller {
    static final String BASE_URL = "https://api.themoviedb.org/3/";
    static final String API_KEY = "0b6ea028fcbf88f08db6d0a34255e651";
    private Retrofit prepare() {
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();
        Retrofit retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit;
    }

    public Call<MoviesResponse> prepareMovieCall(){
        EndPointInterface movieApi = prepare().create(EndPointInterface.class);
        Call<MoviesResponse> call = movieApi.getTopRatedMovies(API_KEY);
        return call;
    }
}
