package com.example.aphish.movie_rental.domain;

/**
 * Created by Aphish on 2016/04/17.
 */
public class Comedy extends Genre {
    @Override
    public String handleMovie(String name) {
        return name;
    }
}
