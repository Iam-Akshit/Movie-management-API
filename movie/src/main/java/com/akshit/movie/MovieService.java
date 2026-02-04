package com.akshit.movie;

import com.akshit.movie.Movie;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Service
public class MovieService {

    private final List<Movie> movieList = new ArrayList<>();
    private final AtomicInteger counter = new AtomicInteger(1);

    public Movie addMovie(Movie movie) {
        if (movie.getId() == 0) {
            movie.setId(counter.getAndIncrement());
        }

        movieList.add(movie);
        return movie;
    }

    public Movie getMovieById(int id) {
        return movieList.stream()
                .filter(movie -> movie.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Movie> getAllMovies() {
        return movieList;
    }
}