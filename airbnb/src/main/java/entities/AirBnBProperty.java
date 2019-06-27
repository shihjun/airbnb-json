package entities;

import java.util.ArrayList;

public class AirBnBProperty {

  int id;
  Detail details;
  ArrayList<PropertyImage> propertyImages;
  Amenity amenities;
  ArrayList<Review> reviews;

  public AirBnBProperty(int id, Detail details, ArrayList<PropertyImage> propertyImages, Amenity amenities,
      ArrayList<Review> reviews) {
    this.id = id;
    this.details = details;
    this.propertyImages = new ArrayList<>();
    this.amenities = amenities;
    this.reviews = new ArrayList<>();
  }

  public void addPropertyImage(PropertyImage propertyImages) {
    this.propertyImages.add(propertyImages);
  }

  public void addReview(Review reviews) {
    this.reviews.add(reviews);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Detail getDetails() {
    return this.details;
  }

  public void setDetails(Detail details) {
    this.details = details;
  }

  public ArrayList<PropertyImage> getPropertyImages() {
    return this.propertyImages;
  }

  public void setPropertyImages(ArrayList<PropertyImage> propertyImages) {
    this.propertyImages = propertyImages;
  }

  public Amenity getAmenities() {
    return this.amenities;
  }

  public void setAmenities(Amenity amenities) {
    this.amenities = amenities;
  }

  public ArrayList<Review> getReviews() {
    return this.reviews;
  }

  public void setReviews(ArrayList<Review> reviews) {
    this.reviews = reviews;
  }

  // public void addImage(Image image) {
  // }

  // public void addAmenity(Amenity amenity) {
  // }

  // public void addAccesibility(Accesibility accesibility) {
  // }

}