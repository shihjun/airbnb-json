package entities;

public class Amenity {
  boolean selfCheckIn;
  boolean kitchenette;
  boolean wifi;

  public Amenity(boolean selfCheckIn, boolean kitchenette, boolean wifi) {
    this.selfCheckIn = selfCheckIn;
    this.kitchenette = kitchenette;
    this.wifi = wifi;
  }

  public boolean isSelfCheckIn() {
    return this.selfCheckIn;
  }

  public boolean getSelfCheckIn() {
    return this.selfCheckIn;
  }

  public void setSelfCheckIn(boolean selfCheckIn) {
    this.selfCheckIn = selfCheckIn;
  }

  public boolean isKitchenette() {
    return this.kitchenette;
  }

  public boolean getKitchenette() {
    return this.kitchenette;
  }

  public void setKitchenette(boolean kitchenette) {
    this.kitchenette = kitchenette;
  }

  public boolean isWifi() {
    return this.wifi;
  }

  public boolean getWifi() {
    return this.wifi;
  }

  public void setWifi(boolean wifi) {
    this.wifi = wifi;
  }

}