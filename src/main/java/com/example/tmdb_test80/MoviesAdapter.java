package com.example.tmdb_test80;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {

    private List<Movie> mMovies;

    public MoviesAdapter(final List<Movie> movies){
        mMovies = movies;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title.setText(mMovies.get(position).original_title);
        holder.description.setText(mMovies.get(position).overview);
    }

    @Override
    public int getItemCount() {
        return mMovies.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final TextView description;

        public ViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.movie_description);
        }
        public TextView getTextViews(){
            return title;
        }
    }
}
