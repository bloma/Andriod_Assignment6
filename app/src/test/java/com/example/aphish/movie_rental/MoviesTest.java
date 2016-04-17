package com.example.aphish.movie_rental;

import com.example.aphish.movie_rental.domain.Movie;
import com.example.aphish.movie_rental.factories.MoviesFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Aphish on 2016/04/17.
 */
public class MoviesTest {

    private MoviesFactory factory;

    @Before
    public void setUp() throws Exception {

        factory = MoviesFactory.getInsance();
    }

    @Test
    public void testMoviesCreation() throws Exception {

        Movie movies = factory.createMovies("Mechanic","3:04:55","12/02/2016");
        Assert.assertEquals("Mechanic",movies.getName());
    }

    @Test
    public void testMoviesUpdate() throws Exception {

        Movie movies = factory.createMovies("Mechanic","3:04:55","12/02/2016");
        Movie newMovies = new Movie
                .Builder()
                .name("Mechanic 2")
                .durationTime("3:17:55")
                .releaseDate("15/05/2017")
                .build();

        Assert.assertEquals("Mechanic 2",newMovies.getName());
    }
}
