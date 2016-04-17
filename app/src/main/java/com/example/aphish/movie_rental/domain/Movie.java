package com.example.aphish.movie_rental.domain;

import java.io.Serializable;

/**
 * Created by Aphish on 2016/04/16.
 */
public class Movie implements Serializable {

    private long id;
    private String name;
    private String releaseDate;
    private String durationTime;
    private Actors actors;

    private Movie(){}

    private Movie(Builder builder){

        this.id = builder.id;
        this.name = builder.name;
        this.releaseDate = builder.releaseDate;
        this.durationTime = builder.durationTime;
        this.actors = builder.actors;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public String getDurationTime() {
        return durationTime;
    }

    public Actors getActors() {
        return actors;
    }

    public static class Builder{

        private long id;
        private String name;
        private String releaseDate;
        private String durationTime;
        private Actors actors;

        private Builder id(long id){
            this.id = id;
            return this;
        }

        public Builder durationTime(String durationTime) {
            this.durationTime = durationTime;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder releaseDate(String releaseDate){
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder Actors(Actors actors) {
            this.actors = actors;
            return this;
        }

        public Builder copy(Movie movie){

            this.id = movie.id;
            this.name = movie.name;
            this.durationTime = movie.durationTime;
            this.releaseDate = movie.releaseDate;
            this.actors = movie.actors;
            return this;
        }

        public Movie build(){
            return new Movie(this);
        }
    }


}
