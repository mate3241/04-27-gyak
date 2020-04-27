package hu.flowacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    List<Site> sites = new ArrayList<>();
    while (quit == false) {
      System.out.println("Válassz menüpontot (csak a számot írd be)");
      System.out.println("1. Telephely felvétele");
      System.out.println("2. Autó felvétele");
      System.out.println("3. Listázás");
      System.out.println("4. Kilépés");
      int choice = Integer.parseInt(scanner.nextLine());
      switch (choice) {
        case 1: {
          System.out.println("Add meg a telephely nevét: ");

          sites.add(new Site(scanner.nextLine()));
          break;
        }
        case 2: {
          System.out.println("Add meg az autó rendszámát");
          String lp = scanner.nextLine();
          System.out.println("Hány km-t futott?");
          int kmRan = Integer.parseInt(scanner.nextLine());
          System.out.println("Melyik telephelyhez tartozik?");
          String siteOfCar = scanner.nextLine();
          for (Site s: sites) {
            if ( s.name.equals(siteOfCar)){
              s.addVehicle(CarRandomGenerator.generateCar(kmRan, lp));
            }
          }
          break;
        }
        case 3: {
          System.out.println("lista");
          for ( Site s : sites
               ) {
            System.out.println(sites.toString());
          }
          break;
        }
        case 4: {
          quit = true;
          break;
        }
      }

    }
  }


}
