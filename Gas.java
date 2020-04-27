package hu.flowacademy;

public class Gas extends Vehicle {
  String type = "gas";

  public Gas(String licensePlate, int kilometersRan, String type) {
    super(licensePlate, kilometersRan);
    this.type = type;
  }

  @Override
  public String toString() {
    return "Gas{" +
            "type='" + type + '\'' +
            ", licensePlate='" + licensePlate + '\'' +
            ", kilometersRan=" + kilometersRan +
            '}';
  }
}
