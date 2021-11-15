package com.example.tmdb_test80;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mMoiviesRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMoiviesRecyclerView = findViewById(R.id.movies_recycler);
        mMoiviesRecyclerView
                .setLayoutManager(new LinearLayoutManager(this));

        Controller controller = new Controller();
        Call<MoviesResponse> moviesCall = controller.prepareMovieCall();
        moviesCall.enqueue(new Callback<MoviesResponse>() {
            @Override
            public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                List<Movie> moviesList = response.body().results;
                moviesList.forEach(movieListShow -> Log.d("MovieList->",movieListShow.toString()));
                mMoiviesRecyclerView.setAdapter(new MoviesAdapter(moviesList));
            }

            @Override
            public void onFailure(Call<MoviesResponse> call, Throwable t) {
                Log.d("LMESSAGE->", t.getLocalizedMessage());
            }
        });
    }
}