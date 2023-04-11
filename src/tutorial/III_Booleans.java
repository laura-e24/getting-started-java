package src.tutorial;

import java.util.Scanner;

public class III_Booleans {
  final static Scanner cold_scanner = new Scanner(System.in);
  final static Scanner rain_scanner = new Scanner(System.in);
  public static void main(String[] args) {
    boolean cold;
    boolean rainy;

    System.out.println("Is it cold right now? (y/n)");
    cold = cold_scanner.next().equals("y");

    System.out.println("Is it raining right now? (y/n)");
    rainy = rain_scanner.next().equals("y");

    if (cold && rainy) {
      System.out.println("DON'T GO OUT!!!");
    } else if (!cold && rainy) {
      System.out.println("UMBRELLA");
    } else if (cold && !rainy) {
      System.out.println("WEAR A COAT");
    } else {
      System.out.println("IT'S A NICE DAY, GO OUT");
    }

    cold_scanner.close();
    rain_scanner.close();
  }
}
