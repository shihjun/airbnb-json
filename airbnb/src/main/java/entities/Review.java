package entities;

public class Review {
  int id;
  String name;
  String image;
  String date;
  String review;

  public Review(int id, String name, String image, String date, String review) {
    this.id = id;
    this.name = name;
    this.image = image;
    this.date = date;
    this.review = review;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getReview() {
    return this.review;
  }

  public void setReview(String review) {
    this.review = review;
  }

}