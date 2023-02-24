package com.example.HotelService.services;

import com.example.HotelService.model.Hotel;
import com.example.HotelService.repo.HotelRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelService {

    @Autowired
    private HotelRepo hotelRepo;


    public List<Hotel> findAllHotel() {
        return this.hotelRepo.findAll();
    }

    public Hotel findAllHotelByUserId(String userId) {
        return this.hotelRepo.findById(userId).get();
    }

    public Hotel addHotel(Hotel hotel) {
        String s = UUID.randomUUID().toString();
        hotel.setId(s);
        return this.hotelRepo.save(hotel);
    }
}
