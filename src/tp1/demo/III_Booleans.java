package src.tp1.demo;

import java.util.Scanner;

public class III_Booleans {
  // Instanciamos dos scanners para cada variable a considerar
  final static Scanner cold_scanner = new Scanner(System.in);
  final static Scanner rain_scanner = new Scanner(System.in);
  public static void main(String[] args) {
    boolean cold;
    boolean rainy;

    // Primero preguntamos si hace frío
    System.out.println("Is it cold right now? (y/n)");
    // Luego de la respuesta del usuario, a cold le asignamos
    // el valor que resulta de igualar la entrada del usuario
    // con el valor esperado ("y"), lo que devolverá un booleano
    cold = cold_scanner.next().equals("y");

    System.out.println("Is it raining right now? (y/n)");
    // Lo mismo hecho arriba para cold se repite para rainy
    rainy = rain_scanner.next().equals("y");


    // Analizamos qué condiciones se cumplen para mostrar el mensaje correcto
    if (cold && rainy) {
      System.out.println("DON'T GO OUT!!!");
    } else if (!cold && rainy) {
      System.out.println("UMBRELLA");
    } else if (cold && !rainy) {
      System.out.println("WEAR A COAT");
    } else {
      System.out.println("IT'S A NICE DAY, GO OUT");
    }

    // Finalmente, cerramos la conexión con ambos escáneres
    cold_scanner.close();
    rain_scanner.close();
  }
}
