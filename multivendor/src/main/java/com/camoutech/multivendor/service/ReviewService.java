package com.camoutech.multivendor.service;

import com.camoutech.multivendor.model.Product;
import com.camoutech.multivendor.model.Review;
import com.camoutech.multivendor.model.User;
import com.camoutech.multivendor.request.CreateReviewRequest;

import java.util.List;

public interface ReviewService {

    Review createReview(CreateReviewRequest req, User user, Product product);
    List<Review> getReviewByProductId(Long productId);
    Review updateReview(Long reviewId, String reviewText, double rating, Long userId) throws Exception;

    void deleteReview(Long reviewId, Long userId) throws Exception;

    Review getReviewById(Long reviewId) throws Exception;
}
