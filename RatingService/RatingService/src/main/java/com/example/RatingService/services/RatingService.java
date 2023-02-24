package com.example.RatingService.services;

import com.example.RatingService.model.Rating;
import com.example.RatingService.repo.RatingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;


@Service
public class RatingService {

    @Autowired
    private RatingRepo ratingRepo;


    public List<Rating> findAllRating() {
        return this.ratingRepo.findAll();
    }

    public Rating findAllRatingByRatingId(String userId) {
        return this.ratingRepo.findById(userId).get();
    }

    public Rating addRating(Rating Rating) {
        String s = UUID.randomUUID().toString();
        Rating.setId(s);
        return this.ratingRepo.save(Rating);
    }

    public List<Rating> findAllRatingByUserId(String userId) {
        List<Rating> byUserId = this.ratingRepo.findByUserId(userId);
        return byUserId;
    }
}
