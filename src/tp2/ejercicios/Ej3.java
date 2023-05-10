package src.tp2.ejercicios;

/*
 * Realizar un programa que muestre los números del 1 al 100 utilizando la instrucción do while 
 * 
 */

public class Ej3 {
  final static int MAXIMUM_NUMBER = 100;
  public static void main(String[] args) {
    int counter = 0;

    do {
      System.out.println(counter + 1);
      counter++;
    } while (counter < MAXIMUM_NUMBER);
  }
}
