package com.example.aphish.movie_rental.factories;

import com.example.aphish.movie_rental.domain.ActionMovies;
import com.example.aphish.movie_rental.domain.Comedy;
import com.example.aphish.movie_rental.domain.Genre;
import com.example.aphish.movie_rental.domain.HorrorMovies;

/**
 * Created by Aphish on 2016/04/17.
 */
public class GenreFactory {

    private static GenreFactory factory = null;

    public static GenreFactory getInstance(){
        if (factory == null)
            factory = new GenreFactory();
        return factory;
    }

    public Genre createGenre(String name){

        Genre genre = new Genre
                .Builder()
                .genreName(name)
                .build();
        return genre;
    }

    public static String getGenre(String name){
        Genre chain = setUpChain();
        return chain.handleMovie(name);
    }

    public static Genre setUpChain(){
        Genre horror = new HorrorMovies();
        Genre action = new ActionMovies();
        Genre comedy = new Comedy();

        horror.setNextGenre(action);
        action.setNextGenre(comedy);

        return horror;
    }
}
