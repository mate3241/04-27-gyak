package hu.flowacademy;

public class Diesel extends Vehicle{
  String type = "Diesel";

  public Diesel(String licensePlate, int kilometersRan, String type) {
    super(licensePlate, kilometersRan);
    this.type = type;
  }

  @Override
  public String toString() {
    return "Diesel{" +
            "type='" + type + '\'' +
            ", licensePlate='" + licensePlate + '\'' +
            ", kilometersRan=" + kilometersRan +
            '}';
  }
}
