package com.example.aphish.movie_rental.factories;

import com.example.aphish.movie_rental.domain.Movie;

/**
 * Created by Aphish on 2016/04/17.
 */
public class MoviesFactory {

    private static MoviesFactory factory = null;

    private MoviesFactory(){}

    public static MoviesFactory getInsance(){
        if (factory == null)
            factory = new MoviesFactory();
        return factory;
    }

    public Movie createMovies(String name,String duration,String date){
        Movie movie = new Movie
                .Builder()
                .name(name)
                .durationTime(duration)
                .releaseDate(date)
                .build();
        return movie;
    }
}
