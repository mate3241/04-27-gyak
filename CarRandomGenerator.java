package hu.flowacademy;

public class CarRandomGenerator {

  public static Vehicle generateCar(int kilometersRan, String licensePlate){
    Vehicle value = Math.random() > 0.5 ? new Diesel(licensePlate, kilometersRan, "diesel") : new Gas(licensePlate, kilometersRan, "gas");
    return value;
  }
}
