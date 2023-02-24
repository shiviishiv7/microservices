package com.example.HotelService.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StaffController {

    @GetMapping("staff")
    public ResponseEntity getAllStaff(){
        List<String> ram = List.of("RAM", "SHYAM", "RAHUL");
        return new ResponseEntity(ram, HttpStatus.OK);
    }


}
