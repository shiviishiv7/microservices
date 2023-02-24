package com.example.HotelService.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Hotel {

    @Id
    private  String id;
    private  String name;
    private  String location;
    private  String about;


}