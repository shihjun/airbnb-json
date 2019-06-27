package entities;

public class Detail {

  String propertyName;
  String image;
  String type;
  int roomNo;
  int bedNo;
  int guestNo;
  int bathNo;
  int hostId;
  String hostName;
  String hostImg;
  boolean verified;
  String currency;
  int stars;
  int numRating;

  public Detail(String propertyName, String image, String type, int roomNo, int bedNo, int guestNo, int bathNo,
      int hostId, String hostName, String hostImg, boolean verified, String currency, int stars, int numRating) {
    this.propertyName = propertyName;
    this.image = image;
    this.type = type;
    this.roomNo = roomNo;
    this.bedNo = bedNo;
    this.guestNo = guestNo;
    this.bathNo = bathNo;
    this.hostId = hostId;
    this.hostName = hostName;
    this.hostImg = hostImg;
    this.verified = verified;
    this.currency = currency;
    this.stars = stars;
    this.numRating = numRating;
  }

  public String getPropertyName() {
    return this.propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getRoomNo() {
    return this.roomNo;
  }

  public void setRoomNo(int roomNo) {
    this.roomNo = roomNo;
  }

  public int getBedNo() {
    return this.bedNo;
  }

  public void setBedNo(int bedNo) {
    this.bedNo = bedNo;
  }

  public int getGuestNo() {
    return this.guestNo;
  }

  public void setGuestNo(int guestNo) {
    this.guestNo = guestNo;
  }

  public int getBathNo() {
    return this.bathNo;
  }

  public void setBathNo(int bathNo) {
    this.bathNo = bathNo;
  }

  public int getHostId() {
    return this.hostId;
  }

  public void setHostId(int hostId) {
    this.hostId = hostId;
  }

  public String getHostName() {
    return this.hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public String getHostImg() {
    return this.hostImg;
  }

  public void setHostImg(String hostImg) {
    this.hostImg = hostImg;
  }

  public boolean isVerified() {
    return this.verified;
  }

  public boolean getVerified() {
    return this.verified;
  }

  public void setVerified(boolean verified) {
    this.verified = verified;
  }

  public String getCurrency() {
    return this.currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public int getStars() {
    return this.stars;
  }

  public void setStars(int stars) {
    this.stars = stars;
  }

  public int getNumRating() {
    return this.numRating;
  }

  public void setNumRating(int numRating) {
    this.numRating = numRating;
  }

}