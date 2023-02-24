package com.example.UserService.services;


import com.example.UserService.model.Hotel;
import com.example.UserService.model.Rating;
import com.example.UserService.model.User;
import com.example.UserService.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private HotelService hotelService;

    @Autowired
    private RatingService ratingService;

    @Autowired
    private RestTemplate restTemplate;

    public List<User> findAllUser() {
        return this.userRepo.findAll();
    }

    public User findUserByUserId(String userId) {

        Optional<User> optionalUser = userRepo.findById(userId);
        if(optionalUser.isEmpty())return null;
        String url = "http://RATING-SERVICE/rating/user/"+userId;
//        RestTemplate restTemplate = new RestTemplate();
       Rating[] ratings =  restTemplate.getForObject(url,Rating[].class);
        List<Rating> collect = Arrays.stream(ratings).collect(Collectors.toList());
//        List<Rating> allRatingByUserId = ratingService.findAllRatingByUserId(userId);
        collect.forEach(rating -> {

            Hotel hotelById = hotelService.findHotelById(rating.getHotelId());
            rating.setHotel(hotelById);
        });
        User user = optionalUser.get();
        user.setRatingList(collect);
        return user;
    }


    public User addUser(User User) {
        String s = UUID.randomUUID().toString();
        User.setId(s);
        return this.userRepo.save(User);
    }
}

