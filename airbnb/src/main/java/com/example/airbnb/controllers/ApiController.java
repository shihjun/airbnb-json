package com.example.airbnb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import entities.AirBnBProperty;
import entities.Amenity;
import entities.Detail;
import entities.Review;
import entities.PropertyImage;

@RestController
public class ApiController {
  @GetMapping(value = "/property", produces = "application/json")
  public AirBnBProperty showAirBnBProperty(@RequestParam Integer id) {
    AirBnBProperty property = new AirBnBProperty(id, null, null, null, null);
    property.setDetails(new Detail("Bright, Comfortable Room in Hospitable, Gay Household",
        "http://next-curriculum.com/airbnb.jpg", "PRIVATE ROOM", 2, 2, 3, 1, 123, "Nicholas & Michele",
        "http://next-curriculum.com/airbnb.jpg", true, "RM", 5, 501));
    property.addPropertyImage(new PropertyImage(1, "Private living room", "http://next-curriculum.com/airbnb.jpg"));
    property.addPropertyImage(new PropertyImage(2, "Private bedroom", "http://next-curriculum.com/airbnb.jpg"));
    property.setAmenities(new Amenity(true, false, true));
    property.addReview(
        new Review(1, "Tabatha", "http://next-curriculum.com/airbnb.jpg", "1/1/2019", "Very convenient location."));
    property.addReview(
        new Review(2, "homas", "http://next-curriculum.com/airbnb.jpg", "1/1/2019", "I was impressed by this place."));
    return property;
  }
}
