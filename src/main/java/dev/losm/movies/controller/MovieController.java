package dev.losm.movies.controller;

import dev.losm.movies.service.MovieService;
import dev.losm.movies.model.Movie;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/movies/")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(), HttpStatus.OK) ;
    }

//    @GetMapping("{id}")
//    public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable ObjectId id){
//        return new ResponseEntity<Optional<Movie>>(movieService.findById(id), HttpStatus.OK);
//    }

    @GetMapping("/{imdbid}")
    public ResponseEntity<Optional<Movie>> getMovieByImdbid(@PathVariable String imdbid){
        return new ResponseEntity<Optional<Movie>>(movieService.findMovieByImdbId(imdbid), HttpStatus.OK);
    }
}
