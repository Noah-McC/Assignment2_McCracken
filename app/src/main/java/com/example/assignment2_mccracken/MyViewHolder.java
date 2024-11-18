// my api key: 8b1721dc
// http://www.omdbapi.com/?apikey=8b1721dc&s=star+wars

package com.example.assignment2_mccracken;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    public MovieClickListener clickListener;

    ImageView imageView;
    TextView title;
    TextView studio;
    TextView rating;
    TextView year;

    public MyViewHolder(@NonNull View movieView, MovieClickListener clickListener){
        super(movieView);
        imageView = movieView.findViewById(R.id.imageView);
        title = movieView.findViewById(R.id.txtViewMovieTitle);
        studio = movieView.findViewById(R.id.txtViewStudio);
        rating = movieView.findViewById(R.id.txtViewRating);
        year = movieView.findViewById(R.id.txtViewYear);
        this.clickListener = clickListener;

        movieView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(clickListener != null){
                    clickListener.onClick(v.getAdapterPosition());
                    Log.d("tag", "onClick");
                }
            }
        });
    }



}
