package com.example.UserService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

    @Id
    private String id;
    private String hotelId;
    private String userId;
    private Integer rating;
    private String feedback;
    private Hotel hotel;
}

