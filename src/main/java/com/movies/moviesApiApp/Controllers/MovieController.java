package com.movies.moviesApiApp.Controllers;

import com.movies.moviesApiApp.Models.Movie;
import com.movies.moviesApiApp.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/movies")
@CrossOrigin(origins = "*")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping()
    public ResponseEntity<List<Movie>> getAllMovies() {
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByImdb(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieByImdb(imdbId), HttpStatus.OK);
    }

    @GetMapping("/title/{movieTitle}")
    public ResponseEntity<Optional<Movie>> getSingleMovieByTitle(@PathVariable String movieTitle) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovieByTitle(movieTitle), HttpStatus.OK);
    }
}
