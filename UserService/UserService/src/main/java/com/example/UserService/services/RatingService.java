package com.example.UserService.services;

import com.example.UserService.model.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "RATING-SERVICE")
public interface RatingService {
    @GetMapping("hotel/userId/{userId}")
    List<Rating> findAllRatingByUserId(@PathVariable("userId")String userId);


    @PostMapping("rating")
    public Rating createRating(@RequestBody Rating rating);




}
