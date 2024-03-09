package dev.losm.movies.service.impl;

import dev.losm.movies.repository.MovieRepository;
import dev.losm.movies.service.MovieService;
import dev.losm.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(ObjectId id){
        return movieRepository.findById(id);
    }

    public Optional<Movie> findMovieByImdbId(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
