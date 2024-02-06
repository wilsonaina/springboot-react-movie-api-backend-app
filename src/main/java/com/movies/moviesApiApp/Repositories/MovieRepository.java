package com.movies.moviesApiApp.Repositories;

import com.movies.moviesApiApp.Models.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    Optional<Movie> findMoviesByImdbId(String id);

    Optional<Movie> findMoviesByTitle(String movieTitle);
}
