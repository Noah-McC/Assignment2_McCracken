package com.example.assignment2_mccracken;
// my api key: 8b1721dc
// http://www.omdbapi.com/?apikey=8b1721dc&

public class Movie {
    //There is no need for images because in order to get them from the api you have to donate
    int movieImg;
    String movieTitle, movieStudio, movieRating, movieYear;


    public Movie(int movieImg, String movieTitle, String movieStudio, String movieRating, String movieYear){
        this.movieImg = movieImg;
        this.movieTitle = movieTitle;
        this.movieStudio = movieStudio;
        this.movieRating = movieRating;
        this.movieYear = movieYear;
    }

    public int getMovieImg(){
        return movieImg;
    }

    public void setMovieImg(int movieImg){
        this.movieImg = movieImg;
    }

    public String getMovieTitle(){
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle){
        this.movieTitle = movieTitle;
    }

    public String getMovieStudio(){
        return movieStudio;
    }

    public void setMovieStudio(String movieStudio){
        this.movieStudio = movieStudio;
    }

    public String getMovieRating(){
        return movieRating;
    }

    public void setMovieRating(String movieRating){
        this.movieRating = movieRating;
    }

    public String getMovieYear(){
        return movieYear;
    }

    public void setMovieYear(String movieYear){
        this.movieYear = movieYear;
    }



}