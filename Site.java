package hu.flowacademy;

import java.util.ArrayList;
import java.util.List;

public class Site {
  String name;
  List<Vehicle> vehicles;

  public Site(String name) {
    this.name = name;
    vehicles = new ArrayList<>();
  }
  public void addVehicle(Vehicle v){
    vehicles.add(v);
  }

  @Override
  public String toString() {
    return "Site{" +
            "name='" + name + '\'' +
            ", vehicles=" + vehicles +
            '}';
  }
}
