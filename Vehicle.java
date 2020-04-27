package hu.flowacademy;

public abstract class Vehicle {
  String licensePlate;
  int kilometersRan;

  public String kilometersLeft(){
    return 100000 - kilometersRan + " kilometers left";
  }

  public Vehicle(String licensePlate, int kilometersRan) {
    this.licensePlate = licensePlate;
    this.kilometersRan = kilometersRan;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
            "licensePlate='" + licensePlate + '\'' +
            ", kilometersRan=" + kilometersRan +
            '}';
  }
}
