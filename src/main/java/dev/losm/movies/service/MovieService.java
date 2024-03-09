package dev.losm.movies.service;

import dev.losm.movies.model.Movie;
import org.bson.types.ObjectId;

import java.util.List;
import java.util.Optional;


public interface MovieService {
    List<Movie> getAllMovies();
//    Optional<Movie> findById(ObjectId id);
    Optional<Movie> findMovieByImdbId(String imdbid);
}
