package com.example.RatingService.controller;

import com.example.RatingService.model.Rating;
import com.example.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rating")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping("/")
    public List<Rating> findAllRating(){
        return this.ratingService.findAllRating();
    }
    @GetMapping("/{ratingId}")
    public Rating findAllRatingByRatingId(@PathVariable("ratingId")String userId){
        return  this.ratingService.findAllRatingByRatingId(userId);
    }
    @GetMapping("/user/{userId}")
    public List<Rating> findAllRatingByUserId(@PathVariable("userId")String userId){
        return  this.ratingService.findAllRatingByUserId(userId);
    }
    @PostMapping
    public Rating addRating(@RequestBody Rating Rating){
        return this.ratingService.addRating(Rating);
    }



}

