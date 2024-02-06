package com.movies.moviesApiApp.Services;

import com.movies.moviesApiApp.Models.Movie;
import com.movies.moviesApiApp.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovieByImdb(String imdbId) {
        return movieRepository.findMoviesByImdbId(imdbId);
    }

    public Optional<Movie> singleMovieByTitle(String movieTitle) {
        return movieRepository.findMoviesByTitle(movieTitle);
    }
}
