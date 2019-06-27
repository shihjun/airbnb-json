package entities;

public class PropertyImage {
  int id;
  String name;
  String image;

  public PropertyImage(int id, String name, String image) {
    this.id = id;
    this.name = name;
    this.image = image;
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

}