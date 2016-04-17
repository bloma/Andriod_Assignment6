package com.example.aphish.movie_rental;

import com.example.aphish.movie_rental.domain.Genre;
import com.example.aphish.movie_rental.factories.GenreFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Aphish on 2016/04/17.
 */
public class GenreTest {

    private GenreFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = GenreFactory.getInstance();
    }

    @Test
    public void testGenreCreation() throws Exception {

        Genre genre = factory.createGenre("horror");
        Assert.assertEquals("horror",genre.getGenreName());

    }
}
