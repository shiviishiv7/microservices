package com.example.HotelService.controller;

import com.example.HotelService.model.Hotel;
import com.example.HotelService.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import java.util.List;

@RestController
@RequestMapping("hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/")
    public List<Hotel> findAllHotel(){
        return this.hotelService.findAllHotel();
    }
    @GetMapping("/{hotelId}")
    public Hotel findAllHotelByUserId(@PathVariable("hotelId")String userId){
        return  this.hotelService.findAllHotelByUserId(userId);
    }
    @PostMapping
    public Hotel addHotel(@RequestBody Hotel hotel){
        return this.hotelService.addHotel(hotel);
    }



}
