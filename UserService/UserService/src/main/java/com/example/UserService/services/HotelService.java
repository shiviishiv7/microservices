package com.example.UserService.services;

import com.example.UserService.model.Hotel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "HOTEL-SERVICE")
public interface HotelService {


    @GetMapping("hotel/{hotelId}")
    Hotel  findHotelById(@PathVariable("hotelId") String hotelId);


}
