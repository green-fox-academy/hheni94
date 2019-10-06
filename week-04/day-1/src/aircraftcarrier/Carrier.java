package aircraftcarrier;

import java.util.ArrayList;

public class Carrier {
  private ArrayList<Aircrafts> aircrafts;
  private int storeOfAmmo;
  private int healthPoint;

  public Carrier(int storeOfAmmo, int healthPoint) {
    this.storeOfAmmo = storeOfAmmo;
    this.healthPoint = healthPoint;
    this.aircrafts = new ArrayList<>();
  }

  public void add(String type) {
    if (type == "F16") {
      aircrafts.add(new AircraftF16());
    } else {
      aircrafts.add(new AircraftF35());
    }
  }

  public void fill() {
    for (int i = 0; i < aircrafts.size(); i++) {
      aircrafts.get(i).refill(storeOfAmmo);
    }
  }
}
