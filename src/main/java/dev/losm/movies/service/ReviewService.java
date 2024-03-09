package dev.losm.movies.service;

import dev.losm.movies.model.Review;

public interface ReviewService {

      Review createReview(String reviewBody, String imdbId);
}
