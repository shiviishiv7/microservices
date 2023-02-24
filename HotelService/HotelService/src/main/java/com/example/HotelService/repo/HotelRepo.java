package com.example.HotelService.repo;

import com.example.HotelService.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface HotelRepo extends JpaRepository<Hotel,String> {
}
