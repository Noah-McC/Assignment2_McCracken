package com.example.assignment2_mccracken;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Movie> movies;
    public MovieClickListener clickListener;

    public MyAdapter(Context context, List<Movie> movies){
        this.context = context;
        this.movies = movies;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View movieView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_layout, parent, false);
        return new MyViewHolder(movieView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position){

        Movie movie = movies.get(position);
        holder.title.setText(movie.getMovieTitle());
        holder.studio.setText(movie.getMovieStudio());
        holder.rating.setText(movie.getMovieRating());
        holder.year.setText(movie.getMovieYear());

    }

    //I can't figure out why this has to be called item count instead of movie count
    @Override
    public int getItemCount() {
        return 0;
    }

}
