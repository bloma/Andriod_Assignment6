package com.example.aphish.movie_rental.factories;

import com.example.aphish.movie_rental.domain.Actors;

/**
 * Created by Aphish on 2016/04/17.
 */
public class ActorsFactory {
    private static ActorsFactory factory = null;

    private ActorsFactory(){}

    public static ActorsFactory getInstance(){
        if (factory == null)
            factory = new ActorsFactory();
        return factory;
    }

    public Actors createActors(String name,String surname,String age,String height){
        Actors actor = new Actors
                .Builder()
                .name(name)
                .surname(surname)
                .age(age)
                .height(height)
                .build();
        return actor;
    }
}
