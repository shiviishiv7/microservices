package com.example.RatingService.repo;

import com.example.RatingService.model.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingRepo extends JpaRepository<Rating,String> {

    List<Rating> findByUserId(String userId);

}
